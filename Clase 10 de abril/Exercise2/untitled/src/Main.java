import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("Introduzca la palabra 'eureka': ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    boolean isTrue = input.equals("eureka");
    if (isTrue) {
      System.out.println("Correcto");
    }
    else {
      System.out.println("Incorrecto");
    }
  }
}

// "input" == "eureka"