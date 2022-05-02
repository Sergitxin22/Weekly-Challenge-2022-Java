/*
 * Reto #17
 *
 * Enunciado: Crea una función que evalúe si un/a atleta ha superado correctamente una
 * carrera de obstáculos.
 * - La función recibirá dos parámetros:
 *      - Un array que sólo puede contener String con las palabras "run" o "jump"
 *      - Un String que represente la pista y sólo puede contener "_" (suelo) o "|" (valla)
 * - La función imprimirá cómo ha finalizado la carrera:
 *      - Si el/a atleta hace "run" en "_" (suelo) y "jump" en "|" (valla) será correcto y no
 *        variará el símbolo de esa parte de la pista.
 *      - Si hace "jump" en "_" (suelo), se variará la pista por "x".
 *      - Si hace "run" en "|" (valla), se variará la pista por "/".
 * - La función retornará un Boolean que indique si ha superado la carrera.
 * Para ello tiene que realizar la opción correcta en cada tramo de la pista.
 *
 * Información adicional:
 * - Retos obtenidos de https://github.com/mouredev/Weekly-Challenge-2022-Kotlin
 *
 */

import java.util.*;

public class Main {
    public static Main() {
		String[] acciones = {"run", "jump", "RUN", "JUMP"};
        String[] pista = {"_", "|", "_", "|"};
		
		System.out.println(carreraSuperada(acciones, pista));
	}
    
    private static boolean carreraSuperada(String[] acciones, String[] pista) {
        if(AccionesCorrectas(acciones) && carreraCorrecta(pista) && acciones.length == pista.length) {			
			for(int i = 0; i < acciones.length; i++){
				if(acciones[i].toLowerCase().compareToIgnoreCase("jump") == 0 && pista[i] == "_"){
                    pista[i] = "x";
                }else if(acciones[i].toLowerCase().compareToIgnoreCase("run") == 0 && pista[i] == "|"){
                    pista[i] = "/";
                }
				System.out.print(pista[i]);
			}
		}else{
            return false;
        }
		System.out.println("");
        return carreraCorrecta(pista);
    }
	
	private static boolean AccionesCorrectas(String[] acciones) {
        int numAcciones = acciones.length;
        int numAccionesCorrectas = 0;
        
        for(String accion: acciones){
            if(accion.toLowerCase().compareToIgnoreCase("run") == 0 || accion.toLowerCase().compareToIgnoreCase("jump") == 0){
                numAccionesCorrectas++;
            }else{
                return false;
            }
        }
        
        if(numAcciones == numAccionesCorrectas && numAcciones > 0){
            return true;
        }else{
            return false;
        }
    }
	
	private static boolean carreraCorrecta(String[] carrera) {
        int numPasos = carrera.length;
        int numPasosCorrectos = 0;
        
        for(String paso: carrera){
            if(paso == "_" || paso == "|"){
                numPasosCorrectos++;
            }else{
                return false;
            }
        }
        
        if(numPasos == numPasosCorrectos && numPasos > 0){
            return true;
        }else{
            return false;
        }
    }
}