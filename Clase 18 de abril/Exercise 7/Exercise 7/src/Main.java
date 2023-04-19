import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    System.out.println("Ingrese el valor (n) hasta el cual desea saber la sucesion de Fibonacci");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println(Arrays.toString(fibonacci(n)));

  }

  public static int[] fibonacci(int n) { // lo hice con recursividad pero hay otras formas

    int[] fib = new int[n]; // se crea el vector recibiendo N como argumento (o parametro?)
    fib[0] = 0;
    if (n > 1) { // condicion para que no se genere un loop infinito y crashee el programa (caso base)
      fib[1] = 1;
      for (int i = 2; i < n; i++)
        fib[i] = fib[i - 1] + fib[i - 2]; // cada numero es la suma de los dos anteriores
    }
    return fib;

  }
}
/*Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci*/