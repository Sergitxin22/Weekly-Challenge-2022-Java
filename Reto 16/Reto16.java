/*
 * Reto #16
 * EN MAYÚSCULA
 * Fecha publicación enunciado: 18/04/22
 * Fecha publicación resolución: 25/04/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 * - No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente.
 *
 * Información adicional:
 * - Retos obtenidos de https://github.com/mouredev/Weekly-Challenge-2022-Kotlin
 *
 */

import java.util.*;

public class Main {
    public static Main() {
        System.out.println(titleCase("Yo vivo en Granada, una ciudad pequeña que tiene monumentos muy importantes como la Alhambra."));
    }
    
    private static String titleCase(String input) {
        String[] frase = input.split("\\s");
        String palabra = "";
        String respuesta = "";
        
        for(int i = 0; i < frase.length; i++){
            palabra = frase[i];
            
            for (int j = 0; j < palabra.length(); j++) { 
                char caracter = palabra.charAt(j);
                if(j == 0){
                    caracter = Character.toUpperCase(caracter);
                }
                respuesta += caracter;
            }
            respuesta += " ";
        }
        return respuesta;
    }
}