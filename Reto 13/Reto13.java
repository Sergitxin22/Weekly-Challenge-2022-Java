/*
 * Reto #13
 * FACTORIAL RECURSIVO
 * Fecha publicación enunciado: 28/03/22
 * Fecha publicación resolución: 04/04/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Escribe una función que calcule y retorne el factorial de un número dado de forma recursiva.
 *
 * Información adicional:
 * - - Retos obtenidos de https://github.com/mouredev/Weekly-Challenge-2022-Kotlin
 *
 */ 

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int num = 6;
        int resp = factorial(num);
        System.out.println(resp);
    }
    
    public static int factorial(int num){
        if (num == 1){
            return 1;
        } else {
            return num*factorial(num-1);
        }
    }
}
