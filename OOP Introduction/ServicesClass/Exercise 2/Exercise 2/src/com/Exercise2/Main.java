package com.Exercise2;

import Services.CoffeeServices;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    CoffeeServices coffeeServices = new CoffeeServices();
    
    int menu = 0;
    do {
      System.out.println("**********************");
      System.out.println("1) Llenar cafetera");
      System.out.println("2) Vaciar cafetera");
      System.out.println("3) Llenar taza");
      System.out.println("4) Hacer café");
      System.out.println("5) Salir");
      System.out.println("**********************");
      System.out.println();
      Scanner scanner = new Scanner(System.in);
      menu = scanner.nextInt();
      switch (menu) {
        case 1:
          coffeeServices.fillCoffeeMaker();
          break;
        case 2:
          coffeeServices.EmptyCoffeeMaker();
          break;
        case 3:
          coffeeServices.fillCupOfCoffee();
          break;
        case 4:
          coffeeServices.makeCoffee();
          break;
        case 5:
          System.out.println("Hasta luego!.");
      }
    }while((menu != 5));
    
  }
}
