package reto4;

/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 *
 * Información adicional:
 * Retos obtenidos de https://github.com/mouredev/Weekly-Challenge-2022-Kotlin
 *
 */

public class Area {

    public static void main(String[] args) throws Exception {
      System.out.println(area(new Triangulo(2D, 4.0D)));
      System.out.println(area(new Rectangulo(2D, 4.0D)));
      System.out.println(area(new Cuadrado(2D)));
   }

   private static final double area(poligono poligono) {
      if (poligono instanceof Triangulo) {
         return ((Triangulo)poligono).getBase() * ((Triangulo)poligono).getAltura() / 2;
      } else if (poligono instanceof Cuadrado) {
         return ((Cuadrado)poligono).getLado() * ((Cuadrado)poligono).getLado();
      } else if (poligono instanceof Rectangulo) {
         return ((Rectangulo)poligono).getAncho() * ((Rectangulo)poligono).getLargo();
      }else{
          return 0.0D;
      }
   }    
}