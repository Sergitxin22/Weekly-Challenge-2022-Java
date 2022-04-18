/*
 * Reto #15
 * ¿CUÁNTOS DÍAS?
 * Fecha publicación enunciado: 11/04/22
 * Fecha publicación resolución: 18/04/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Crea una función que calcule y retorne cuántos días hay entre dos cadenas de texto que representen fechas.
 * - Una cadena de texto que representa una fecha tiene el formato "dd/MM/yyyy".
 * - La función recibirá dos String y retornará un Int.
 * - La diferencia en días será absoluta (no importa el orden de las fechas).
 * - Si una de las dos cadenas de texto no representa una fecha correcta se lanzará una excepción.
 *
 * Información adicional:
 * - Retos obtenidos de https://github.com/mouredev/Weekly-Challenge-2022-Kotlin
 *
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public static DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);    
public static int dias = 0;
	
public class Main {
    System.out.println(calcularDias("20/06/2003", "20/06/2002"));
	System.out.println(calcularDias("20-06-2003", "20-06-2002"));
}

public static int calcularDias(String f1, String f2){
	try {
		df.parse(f1);
		df.parse(f2);
		
		int s1 = f1.indexOf("/");
		int s2 = f1.lastIndexOf("/");
		
		int dia = Integer.parseInt(f1.substring(0, s1));
		int mes = Integer.parseInt(f1.substring(s1+1, s2));
		int año = Integer.parseInt(f1.substring(s2+1));
		
		GregorianCalendar gc1 = new GregorianCalendar(año, mes-1, dia);
		
		dia = Integer.parseInt(f2.substring(0, s1));
		mes = Integer.parseInt(f2.substring(s1+1, s2));
		año = Integer.parseInt(f2.substring(s2+1));
		
		GregorianCalendar gc2 = new GregorianCalendar(año, mes-1, dia);
		
		dias = (int) ((gc1.getTimeInMillis() - gc2.getTimeInMillis()) / (24*3600*1000));
	} catch (ParseException ex) {
		Logger.getLogger(CuantosDías.class.getName()).log(Level.SEVERE, null, ex);
	}
	return (dias < 0) ? -dias : dias;
}