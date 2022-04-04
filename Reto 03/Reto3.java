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
        
        metodo1();
        // metodo2()
    }
    
    private static void metodo1(){
        
        int i = 1;
        for (; i < 100; i++) {
            int numDivisores = 0;
            int j = 1;
            
            for (; j <= i; j++) {
                if (i % j == 0) {
                    numDivisores++;
                }
            }
            if (numDivisores == 2) {
                System.out.println(i);
            }
        }
    }
    
    private static void metodo2(){
        
        int i = 1;
        for (; i < 100; i++) {
            int j = 2;
            while (j < i && i % j != 0) {
                j++;
            }
            if (j == i) {
                System.out.println(i);
            }
        }
    }
}
