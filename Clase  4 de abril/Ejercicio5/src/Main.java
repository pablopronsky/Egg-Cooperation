import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("Hola, ingresá un número (entero), y el programa te mostrará, el doble, el triple, y su raiz cuadrada: ");
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    int doble = input * 2;
    int triple = input * 3;
    double raizCuadrada = Math.sqrt(input);
    System.out.println("El doble de " + input + " es: " + doble);
    System.out.println("El triple de " + input + " es: " + triple);
    System.out.println("La raiz cuadrada de " + input + " es: " + raizCuadrada);
  }
}