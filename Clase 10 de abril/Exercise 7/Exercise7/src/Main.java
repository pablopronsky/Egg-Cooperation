import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int contador = 0;
    int contadorError = 0;
    Scanner scanner = new Scanner(System.in);
    String cadena;
    System.out.println("Hola, este es un programa RS232");

    do {
      System.out.println("Por favor ingrese caracteres: ");
      System.out.println("Para finalizar ingrese &&&&&");

      cadena = scanner.nextLine();

      if (cadena.length() >= 2 && cadena.length() <= 5) {
        if (cadena.substring(0, 1).equals("X") && (cadena.substring(cadena.length() - 1).equals("O"))) {
          contador++;
        } else {
          contadorError++;

        }
      } else {
        contadorError++;
      }
    } while (!cadena.equals("&&&&&"));
    System.out.println("La cantidad bien son: " + contador);
    System.out.println("La cantidad mal son: " + (contadorError - 1));
  }
}