import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.print("Ingrese la cantidad de filas que tiene la matriz: ");
    int rows = scanner.nextInt();
    System.out.print("Ingrese la cantidad de columnas que tiene la matriz: ");
    int columns = scanner.nextInt();

    int [][] matrix = new int[rows][columns];

    // aca rellenamos la matriz con numeros aleatorios del 1 al 5
    for (int i = 0; i < rows; i++)
      for (int j = 0; j < columns; j++)
        matrix[i][j] = random.nextInt(5);

    // imprimimos la matriz para poder corroborar que la suma es correcta
    System.out.println(Arrays.deepToString(matrix));

    // aca hacemos la suma de todos los numeros en todas las posiciones de la matriz
    int auxiliarQueSuma = 0;
    for (int i = 0; i < rows; i++)
      for (int j = 0; j < columns; j++)
        auxiliarQueSuma = matrix[i][j] + auxiliarQueSuma;

    System.out.println("La suma de todos los numeros del array deberia ser: " + auxiliarQueSuma);
  }
}


/*Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
 */