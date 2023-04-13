import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int input;
    int numerosTotales =0;
    int pares = 0;
    int impares = 0;
    while (true) {
      System.out.print("Hola, escribi numeros enteros aleatorios: ");
      input = scanner.nextInt();
      if(input % 5 == 0) {
        break;
      }
      if (input % 2 == 0){
        pares++;
      }else {
        impares++;
      }
      numerosTotales++;
    }
    System.out.println("Se detuvo la lectura de numeros. Se han leído en total " + (numerosTotales +1)+
      " numeros (contando al 5) ,la cantidad de numeros pares fue de: " + pares + " , y la cantidad" +
      "de numeros impares (contando al 5) fue de: " + (impares+1));
  }
}

/*Escriba un programa que lea números enteros.
Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos,
la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben sumarse.
Nota: recordar el uso de la sentencia break.*/