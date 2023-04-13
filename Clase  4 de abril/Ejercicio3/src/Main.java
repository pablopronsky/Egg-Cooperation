import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("Hola! Escribí una frase aleatoria:");
    Scanner scanner = new Scanner(System.in);
    String frase = scanner.nextLine();
    String enMinuscula = frase.toLowerCase();
    String enMayuscula = frase.toUpperCase();
    System.out.println("La frase en minúscula es: " + enMinuscula);
    System.out.println("La frase en mayúscula es: " + enMayuscula);
  }
}