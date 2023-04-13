import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    System.out.print("Escribe una frase o palabra: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    if (input.substring(0,1).equals("A")) {
      System.out.println("Correcto");
    }
    else {
      System.out.println("Incorrecto");
    }
  }
}