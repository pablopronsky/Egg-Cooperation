import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("Hola!, ingresa una temperatura en escala Celcius que la convertiré a Farenheit: ");
    Scanner scanner = new Scanner (System.in);
    double celcius = scanner.nextDouble();
    double farenheit = 32 + (9 * celcius / 5);
    System.out.println(celcius + " grados Celcius, equivalen a " + farenheit + " grados Farenheit");
  }
}