package com.pablopronsky;

public class Rectangle {
  int side1;
  int side2;
  // constructor
  public Rectangle(int side1, int side2) {
    this.side1 = side1;
    this.side2 = side2;
  }
  //metodo
  public int calculateArea(){
     return side1 * side2;
  }
}
/*Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método
"calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y
imprime el área del rectángulo.*/