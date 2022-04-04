import java.util.*;

/*
 * Reto #8
 * DECIMAL A BINARIO
 * Fecha publicación enunciado: 18/02/22
 * Fecha publicación resolución: 02/03/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa se encargue de transformar un número decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 *
 * Información adicional:
 * - Retos obtenidos de https://github.com/mouredev/Weekly-Challenge-2022-Kotlin
 *
 */
 
public class Main {
    public static void main(String[] args) throws Exception {
        mostrarBinario(5);        
    }
    
    private static void mostrarBinario(int num){
        System.out.println("Número en decimal: " + num);
        System.out.println("Numero en binario: " + decimalABinario(num));
    }
    
    private static String decimalABinario(int num){
        String binario = "";
        int decimal = num;
        
        while(decimal >= 0){
            if(decimal % 2 == 0){
                binario+= 0;
            }else{
                binario+= 1;
            }
            decimal= decimal / 2;
            
            if(decimal==0){
                decimal--;
            }
        }
        
        char binarioArray[] = binario.toCharArray();
        char aux;
        
        for (int i=0; i<binarioArray.length/2; i++) {
            aux = binarioArray[i];
            binarioArray[i] = binarioArray[binarioArray.length-1-i];
            binarioArray[binarioArray.length-1-i] = aux;
        }
        return String.valueOf(binarioArray);
    }
}