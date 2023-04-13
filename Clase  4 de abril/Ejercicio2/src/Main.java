import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("Hola, cuál es tu nombre?: ");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    System.out.println("Genial! Tu nombre es: " + name);
  }
}