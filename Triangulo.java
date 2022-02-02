/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4;

/**
 *
 * @author sergio
 */
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
