import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    System.out.println("Ingrese el valor (n) hasta el cual desea saber la sucesion de Fibonacci");
    Scanner scanner = new Scanner(System.in);
    int numInput = scanner.nextInt();
    System.out.println(Arrays.toString(fibonacci(numInput)));

  }

  public static int[] fibonacci(int numInput) { // lo hice con recursividad pero hay otras formas

    int[] sucesionDeFibonacci = new int[numInput]; // se crea el vector recibiendo N como argumento (o parametro?)
    sucesionDeFibonacci[0] = 0;
    if (numInput > 1) { // condicion para que no se genere un loop infinito y crashee el programa (caso base)
      sucesionDeFibonacci[1] = 1;
      for (int i = 2; i < numInput; i++)
        sucesionDeFibonacci[i] = sucesionDeFibonacci[i - 1] + sucesionDeFibonacci[i - 2]; // cada numero es la suma de los dos anteriores
    }
    return sucesionDeFibonacci;

  }
}
/*Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci*/