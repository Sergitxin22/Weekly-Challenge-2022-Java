import java.util.*;

/*
 * Reto #2
 * LA SUCESIÓN DE FIBONACCI
 * Fecha publicación enunciado: 10/01/22
 * Fecha publicación resolución: 17/01/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 *
 * Información adicional:
 * - Retos obtenidos de https://github.com/mouredev/Weekly-Challenge-2022-Kotlin
 *
 */
 
public class Main {
    public static void main(String[] args) throws Exception {
        
        long sucesion[] = new long[50];
        int i = 0;
        for (; i < 50; i++) {
            if (i < 2) {
                sucesion[i] = i;
            } else {
                sucesion[i] = sucesion[i - 1] + sucesion[i - 2];
            }
            System.out.println((i+1) + " " + sucesion[i]); 
        }
    }
}
