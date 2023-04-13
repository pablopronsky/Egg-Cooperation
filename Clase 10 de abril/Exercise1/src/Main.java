import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Escriba un número y le diré si es par o impar: ");

    // Verifica si el siguiente dato ingresado por el usuario es un número entero
    while (!scanner.hasNextInt()) {
      // Si no es un número entero, muestra un mensaje de error y descarta el dato ingresado
      System.out.println("No es un número entero. Intentalo de vuelta.");
      scanner.next();
    }

    // Si el dato ingresado es un número entero, lo lee y lo almacena en la variable input
    int input = scanner.nextInt();

    // Verifica si el número es par o impar usando el operador módulo (%)
    if (input % 2 == 0) {
      System.out.println("El número " + input + " es par");
    } else {
      System.out.println("El número " + input + " es impar");
    }
  }
}