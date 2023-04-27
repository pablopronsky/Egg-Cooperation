package com.pablopronsky;

import java.util.Scanner;

public class Game {
  int firstPlayerNumber;
  int secondPlayerGuess;
  int intentos = 3;
  int firstPlayerWins = 0;
  int secondPlayerWins = 0;
  int contadorRandom = 0;
  int continuePlaying = 0;

  public Game() {
  }

  public void iniciarjuego(){
    Scanner scanner = new Scanner(System.in);

    // lógica del juego
   do {
     System.out.print("Primer jugador, elegí un numero para que el otro jugador adivine (del 1 al 20): ");
     firstPlayerNumber = scanner.nextInt();
     System.out.println("Segundo jugador, tenes 3 intentos para adivinar. Te vamos a ayudar con pistas: ");

     do {
       System.out.print("Elegí un número del 1 al 20: ");
       secondPlayerGuess = scanner.nextInt();

       if (firstPlayerNumber > secondPlayerGuess)
         System.out.println("Te quedaste corto.");
       else if (firstPlayerNumber < secondPlayerGuess)
         System.out.println("Te pasaste");
       else {
         System.out.println("El jugador 2 ha ganado");
         secondPlayerWins++;
         contadorRandom = 1;
         break;
       }

       intentos--;
       if (intentos == 0 && contadorRandom == 0 ){
         System.out.println("El jugador 1 ganó");
         firstPlayerWins++;
       }
     }while (intentos != 0);

     System.out.println("El jugador 1 ha ganado " + firstPlayerWins + " veces");
     System.out.println("El jugador 2 ha ganado " + secondPlayerWins + " veces");
     System.out.println("Si quieres jugar de vuelta, ingresa 1, para salir, ingresa 0. ");
     continuePlaying = scanner.nextInt();

   }while(continuePlaying == 1);

   scanner.close();
  }
}
/*Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un
juego de adivinanza de números. El primer jugador elige un número y el segundo jugador intenta adivinarlo.
El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después
de cada intento. El juego termina cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */