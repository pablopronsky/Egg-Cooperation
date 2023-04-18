import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el tamaño de ambos vectores (seran iguales): ");
    int n = scanner.nextInt();
    int [] firstArray = new int[n];
    int [] secondArray = new int [n];

    // for loops para rellenar los arrays con inputs del usuario
    for (int i = 0; i < firstArray.length; i++){
      System.out.println("Ingresa un numero para asignar dentro del array numero 1 en la posicion " + i+ " :");
      firstArray[i] = scanner.nextInt();
    }
    for (int i = 0; i < secondArray.length; i++){
      System.out.println("Ingresa un numero para asignar dentro del array numero 2 en la posicion " + i + " :");
      secondArray[i] = scanner.nextInt();
    }

    // comparacion de ambos arrays
    for (int i = 0; i < firstArray.length; i++){
      for (int j = 0; j < secondArray.length; j++){
        boolean areEquals = Arrays.equals(firstArray, secondArray);
        if (!areEquals){
          System.out.println("Arrays distintos, saliendo...");
          System.exit(0);
        }
      }
    }
    // de haber asignado yo los valores, podria haber hecho: boolean areEquals = array.equals(firstArray, secondArray); y printear el resultado
  }
}

/*
* Escriba un programa que averigüe si dos vectores de N enteros son iguales
* (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
*/