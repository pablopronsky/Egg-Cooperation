import java.util.Scanner;

    public class Main {
      public static void main(String[] args) {
        System.out.print("Ingresa un número entre 1 y 10 y lo convertiré a romano: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        switch (input) {
          case "1" -> System.out.println("Tu número en romano es: I");
          case "2" -> System.out.println("Tu número en romano es: II");
          case "3" -> System.out.println("Tu número en romano es: III");
          case "4" -> System.out.println("Tu número en romano es: IV");
          case "5" -> System.out.println("Tu número en romano es: V");
          case "6" -> System.out.println("Tu número en romano es: VI");
          case "7" -> System.out.println("Tu número en romano es: VII");
          case "8" -> System.out.println("Tu número en romano es: VIII");
          case "9" -> System.out.println("Tu número en romano es: IX");
          case "10" -> System.out.println("Tu número en romano es: X");
        }
      }

    }