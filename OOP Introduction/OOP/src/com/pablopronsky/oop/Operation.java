package com.pablopronsky.oop;

import java.util.Scanner;

public class Operation {
  Scanner scanner = new Scanner(System.in);

  //atributos

  private int numero1;
  private int numero2;

  // constructor con parametros

  public Operation(int numero1, int numero2){
    this.numero1 = numero1;
    this.numero2 = numero2;
  }

  // constructor sin parametros

  public Operation(){

  }

  // getters y setters

  public int getNumero1() {
    return numero1;
  }

  public void setNumero1(int numero1) {
    this.numero1 = numero1;
  }

  public int getNumero2() {
    return numero2;
  }

  public void setNumero2(int numero2) {
    this.numero2 = numero2;
  }

  // metodos

  void crearOperacion(){
    System.out.print("Ingrese el primer numero: ");
    numero1 = scanner.nextInt();
    System.out.print("Ingrese el segundo numero: ");
    numero2 = scanner.nextInt();
  }

  int sumar(){
    return numero1+numero2;
  }

  int restar(){
    return numero1 - numero2;
  }

  int multiplicar(){
    if (numero1 == 0 || numero2 == 0){
      System.out.println("No se puede dividir por 0");
      return 0;
    }
    return numero1 * numero2;
  }

  int dividir (){
    if (numero1 == 0 || numero2 == 0){
      System.out.println("No se puede dividir por 0");
      return 0;
    }
    return numero1 / numero2;
  }
}
