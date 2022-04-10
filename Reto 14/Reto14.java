/*
 * Reto #14
 * ¿ES UN NÚMERO DE ARMSTRONG?
 * Fecha publicación enunciado: 04/04/22
 * Fecha publicación resolución: 11/04/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Escribe una función que calcule si un número dado es un número de Amstrong (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información al respecto.
 *
 * Información adicional:
 * - Retos obtenidos de https://github.com/mouredev/Weekly-Challenge-2022-Kotlin
 *
 */

import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int numero1 = 370;
        int numero2 = 512;
        int numero3 = 153;

        System.out.println(esArmstrong(numero1));
        System.out.println(esArmstrong(numero2));
        System.out.println(esArmstrong(numero3));
    }

    private static boolean esArmstrong(int num){
        int length = Integer.toString(num).length();
        int suma = 0;
        int digito = 0;

        for (char c: String.valueOf(num).toCharArray()){
            digito = Character.getNumericValue(c);
            digito = (int) Math.pow(digito, length);
            suma += digito;
        }

        return (num == suma) ? true : false;
    }
}
