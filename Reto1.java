import java.util.*;

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 * Información adicional:
 * - Retos obtenidos de https://github.com/mouredev/Weekly-Challenge-2022-Kotlin
 *
 */
 
public class Main {
    public static void main(String[] args) throws Exception {
        
        boolean anagrama = esAnagrama("Holaa", "hLoaa");
        // boolean anagrama = esAnagrama2("Holaa", "hLoaa");
        
        if (anagrama) {
            System.out.println("Las dos palabras son anagramas");
        } else {
            System.out.println("Las dos palabras NO son anagramas");
        }
    }
    
    private static boolean esAnagrama(String palabra1, String palabra2){
        
        // Convertir String palabra1 en array
        char StrPalabra1[] = palabra1.toLowerCase().toCharArray();
    
        // Convertir String palabra2 en array
        char StrPalabra2[] = palabra2.toLowerCase().toCharArray();
        
        boolean resp = false;
        
        if (!palabra1.equalsIgnoreCase(palabra2)) {
            if (StrPalabra1.length == StrPalabra2.length) { // Las dos palabras tienen el mismo numero de letras
                int i = 0;
                int letrasExistentes = 0;
                do { // Mientras la posicion exista 0
                    int j = 0;
                    while (j < StrPalabra2.length && StrPalabra1[i] != StrPalabra2[j]) {
                        j++;
                    }
                    if (j < StrPalabra2.length) {
                        System.out.println("Existe la letra " + StrPalabra1[i] + " en la posicion " + j);
                        letrasExistentes++;
                        StrPalabra2[j] = '0';
                    } else {
                        System.out.println("No existe la letra " + StrPalabra1[i]);
                        resp = false;
                    }
                    i++;
                } while (i < StrPalabra1.length);
                if (letrasExistentes == StrPalabra2.length) {
                    resp = true;
                }
            } else {
                resp = false;
            }
        }
        return resp;
    }
    
    private static boolean esAnagrama2(String palabra1, String palabra2){
        
        String palabra1Lower = palabra1.toLowerCase();
        String palabra2Lower = palabra2.toLowerCase();
        
        char palabra1Char[] = palabra1Lower.replace("[^\\\\dA-Za-z]", "").toCharArray();
        char palabra2Char[] = palabra2Lower.replace("[^\\\\dA-Za-z]", "").toCharArray();
        
        Arrays.sort(palabra1Char);
        Arrays.sort(palabra2Char);
        return Arrays.equals(palabra1Char, palabra2Char);
    }
}
