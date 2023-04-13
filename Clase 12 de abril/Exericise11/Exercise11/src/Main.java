import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    System.out.print("Hola! Ingresa un numero entero!: ");
    Scanner scanner = new Scanner(System.in);
    int inputUser = scanner.nextInt();
    int contador = 0;
    do {
      inputUser = inputUser / 10;
      contador++;
    } while (inputUser > 0);
    System.out.println("El número ingresado tiene " + contador + " digitos");

  }
}

/*Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número.
Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5.
Calcular la cantidad de dígitos matemáticamente utilizando el operador de división.
Nota: recordar que las variables de tipo entero truncan los números o resultados*/