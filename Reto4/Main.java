package reto4;

public class Main {

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
