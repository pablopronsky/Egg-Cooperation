import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    System.out.print("Hola, ingresá una cantidad de minutos: ");
    Scanner scanner = new Scanner(System.in);
    int inputMinutes = scanner.nextInt();
    int days = inputMinutes / (60 * 24);
    int hours = (inputMinutes % (60 * 24)) / 60;
    int minutes = (inputMinutes % (60 *24)) % 60;
    System.out.println(days + " dias, " + hours + " horas, "+ minutes +", minutos");
  }
}
/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo,
si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/
