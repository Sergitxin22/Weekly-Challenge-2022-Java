import java.util.*;

/*
 * Reto #3
 * ¿ES UN NÚMERO PRIMO?
 * Fecha publicación enunciado: 17/01/22
 * Fecha publicación resolución: 24/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 *
 * Información adicional:
 * - Retos obtenidos de https://github.com/mouredev/Weekly-Challenge-2022-Kotlin
 *
 */

public class Main {

    public static void main(String[] args) throws Exception {
        String textoOrdenado = "Hola mundo";
        InvertirCadena(textoOrdenado);
    }   
    
    public static void InvertirCadena(String textoOrdenado){
        char[] cadenaOrdenada = textoOrdenado.toCharArray();
        char[] cadenaInvertida = new char[cadenaOrdenada.length];
        
        for (int i = cadenaOrdenada.length - 1; i >= 0 ; i--) {
            cadenaInvertida[cadenaInvertida.length - i - 1] = cadenaOrdenada[i];
        }
        
        String textoInvertido = String.valueOf(cadenaInvertida);
        System.out.println(textoOrdenado);
        System.out.println(textoInvertido);
    }
}