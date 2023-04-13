import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("El programa le pedirá dos números y luego los sumará.");
    System.out.print("Ingrese el primer número: ");
    int primerNumero = scanner.nextInt();
    System.out.print("Ingrese el segundo número: ");
    int segundoNumero = scanner.nextInt();
    int sumaDeNumeros = primerNumero + segundoNumero;
    System.out.println("La suma de los números es: " + sumaDeNumeros);
  }
}