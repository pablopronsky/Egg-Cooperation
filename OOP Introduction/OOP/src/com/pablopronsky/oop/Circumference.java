package com.pablopronsky.oop;

import java.util.Scanner;

class Circumference {
   Scanner scanner = new Scanner(System.in);

  private double radio;
  void crearCircunferencia(double radio){
  }
  double area(double radio){
    //return (3.1416 * radio) * (3.1416 * radio);
    return Math.PI*(radio*radio);
  }
  double perimetro(double radio){
    return 2*3.1416*radio;
  }
  public Circumference(){
    this.radio = radio;
  }

   public double getRadio() {
     return radio;
   }

   public void setRadio(double radio) {
     this.radio = radio;
   }
 }
