package com.pablopronsky;

import java.util.Random;
import java.util.Scanner;

public class Guess {
  public void iniciarJuego(){
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String input;
    String [] meses = {"enero","febrero","marzo","abril","mayo","junio","julio",
        "agosto","septiembre","octubre","noviembre","diciembre"};
    String mesSecreto = meses[random.nextInt(12)];
    boolean isTrue;
    do{
      System.out.println("Adivina el mes: ");
      input = scanner.nextLine().toLowerCase();
      isTrue = input.equals(mesSecreto);
    }while(!isTrue);
    System.out.println("¡Adivinaste el mes secreto!");
  }
}