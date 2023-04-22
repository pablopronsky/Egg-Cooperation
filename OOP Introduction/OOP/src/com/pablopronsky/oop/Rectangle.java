package com.pablopronsky.oop;
import java.util.Scanner;
public class Rectangle {

  Scanner scanner = new Scanner(System.in);

  private int base;
  private int height;

  //getters & setters

  public int getBase() {
    return base;
  }

  public void setBase(int base) {
    this.base = base;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  // metodos

  void rectangleCreator(){
    System.out.println("Ingrese la base del rectangulo: ");
    base = scanner.nextInt();
    System.out.println("Ingrese la altura del rectangulo: ");
    height = scanner.nextInt();
  }

  void calculateSurface(){
    System.out.println("La superficie del rectángulo es: " + (base * height));
  }

  void calculatePerimeter(){
    System.out.println("El perímetro del rectángulo es: " + ((base + height) * 2));
  }

  void drawRectangle(){
    for (int i = 0; i < height; i++){
      for (int j = 0; j < base; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
