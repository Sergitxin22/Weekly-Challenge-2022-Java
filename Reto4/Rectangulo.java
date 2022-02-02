package reto4;

public class Rectangulo implements poligono {
   private final double ancho;
   private final double largo;

   public final double getAncho() {
      return this.ancho;
   }

   public final double getLargo() {
      return this.largo;
   }

   public Rectangulo(double ancho, double largo) {
      this.ancho = ancho;
      this.largo = largo;
   }
}
