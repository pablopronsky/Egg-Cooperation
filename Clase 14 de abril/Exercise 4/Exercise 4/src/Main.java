import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("Ingresa un numero y te diré si es primo: ");
    Scanner scanner = new Scanner(System.in);
    int inputNumeroPrimo = scanner.nextInt();
    System.out.println(esPrimo(inputNumeroPrimo));
  }
  public static boolean esPrimo(int inputNumeroPrimo) {
      // Comprueba si el número es menor o igual a 1, si lo es, no puede ser primi
      if (inputNumeroPrimo <= 1) {
        return false;
      }
      // Comprueba si el número es divisible por algún número entre 2 y la raíz cuadrada del número, si lo es, no puede ser primo
    int i = 2;
    while (i <= Math.sqrt(inputNumeroPrimo)) {
      if (inputNumeroPrimo % i == 0) {
        return false;
      }
      i++;
    }
      // Si el bucle termina sin encontrar un divisor del número, entonces el número es primo
      return true;
  }
}

/*
* Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que nos indique
* si es o no un número primo, debe devolver true si es primo, sino false.
* Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
* Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
*/