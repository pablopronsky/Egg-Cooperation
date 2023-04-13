import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hola, ingresá una frase de 8 caracteres de largo");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    boolean isTrue = input.length() == 8;
    if (isTrue) {
      System.out.println("Correcto");
    }
    else {
      System.out.println("Incorrecto");
    }
  }
}