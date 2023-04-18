import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el tamaño del vector a rellenar: ");
    int n = scanner.nextInt();
    int [] vector = new int [n];

    // for loop que rellena el vector
    for (int i = 0; i < vector.length /*tambien puede ser 'i < n' */; i++){
      System.out.print("Ingrese valores enteros y el programa los sumará: ");
      vector[i] = scanner.nextInt();
    }

    // for loop que suma los distintos valores del vector y los retorna
    int sumaDeNumeros = 0;
    for (int i = 0; i < vector.length; i++){
      sumaDeNumeros = vector[i] + sumaDeNumeros;
    }
    System.out.println("La suma de todos los números del vector es: " + sumaDeNumeros);
  }
}

/*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
con los valores ingresados por el usuario.
 */