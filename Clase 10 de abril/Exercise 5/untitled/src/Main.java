import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //Escriba un programa en el cual se ingrese un valor límite positivo,
    // y a continuación solicite números al usuario hasta que la suma de los
    // números introducidos supere el límite inicial.


    System.out.print("Ingrese un numero entero: ");
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    int contador = 0;
    for (int i = 0;contador < input; i++) {
      System.out.println("Ingrese otro entero");
      int inputDos = scanner.nextInt();
      contador = contador + inputDos;
    }
    System.out.println("Te pasaste");
  }
}