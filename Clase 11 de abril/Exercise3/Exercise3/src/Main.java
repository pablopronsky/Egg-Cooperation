import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("Ingrese una letra: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    System.out.println(input);
    input = input.toLowerCase();
    if (input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u") )
      System.out.println("Es vocal");
    else
      System.out.println("No es vocal (vocaln't)");
  }
}

/*
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
 Caso contrario mostrar un mensaje.
 Nota: investigar la función equals() de la clase String. */