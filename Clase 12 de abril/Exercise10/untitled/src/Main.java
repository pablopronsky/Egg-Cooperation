import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    System.out.println("Hola, deberás adivinar el resultado del producto de dos enteros (entre 0 y 10)");
    Scanner scanner = new Scanner(System.in);
    int firstRandomNumber = (int)(Math.random() * 10);
    int secondRandomNumber = (int)(Math.random() * 10);
    int multiplyResult = firstRandomNumber * secondRandomNumber;
    boolean isCorrect = false;
    do {
      System.out.print("Cuanto es " + firstRandomNumber + " * " + secondRandomNumber + " ?: ");
      int userGuess = scanner.nextInt();
      isCorrect = userGuess == multiplyResult;
      if (isCorrect)
        System.out.println("Excelente!");
      else
        System.out.println("Burro!");
    }while (!isCorrect);
  }
}

  /*Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números
  generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta es o no correcta.
  En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente.
  Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.*/