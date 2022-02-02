package reto4;

public class Triangulo implements poligono {
   private final double base;
   private final double altura;

   public final double getBase() {
      return this.base;
   }

   public final double getAltura() {
      return this.altura;
   }

   public Triangulo(double base, double altura) {
      this.base = base;
      this.altura = altura;
   }
}
