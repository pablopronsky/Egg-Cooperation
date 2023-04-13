import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa el tamaño del cuadrado: ");
    int cuadrado = scanner.nextInt();

    for (int i = 1; i <= cuadrado; i++) {
      for (int j = 1; j <= cuadrado; j++) {
        if (i == 1 || i == cuadrado || j == 1 || j == cuadrado) {
          System.out.print("* "); // Printea asteriscos en los bordes del cuadrado
        } else {
          System.out.print("  "); // Printea espacios en adentro del cuadrado
        }
      }
      System.out.println(); // Printea una nueva línea después de cada fila
    }
  }
}