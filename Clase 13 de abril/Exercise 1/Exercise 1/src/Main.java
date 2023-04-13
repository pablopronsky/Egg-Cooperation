import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hola, esta es una calculadora de operaciones aritméticas simples.");
    System.out.print("Ingresa el primer número para tu operacion: ");
    int firstInput = scanner.nextInt();
    System.out.print("Ingresa el segundo numero para tu operacion: ");
    int secondInput = scanner.nextInt();
    if (firstInput < secondInput) {
      System.out.println("El segundo número no puede ser mayor al primero, sino me cagas la vida. Volvé a empezar por gato");
      System.exit(0);
    }
    System.out.print("Excelente, ahora elegí que tipo de operación querés realizar,");
    String optionMenu;
    do {
      optionMenu = scanner.nextLine();
      System.out.print("Escribí 's' para sumar, 'r' para restar, 'm' para multiplicar, 'd' para dividir y 'e' para salir:");
      switch (optionMenu.toLowerCase()) {
        case "s" -> System.out.println(funcionQueSuma(firstInput, secondInput));
        case "r" -> System.out.println(funcionQueResta(firstInput, secondInput));
        case "m" -> System.out.println(funcionQueMultiplica(firstInput, secondInput));
        case "d" -> System.out.println(funcionQueDivide(firstInput, secondInput));
        case "e" -> {
          System.exit(0);
        }
      }
    } while (!optionMenu.equals("e"));
  }
  public static int funcionQueSuma(int firstInput, int secondInput){
    return firstInput + secondInput;
  }
  public static int funcionQueResta(int firstInput, int secondInput){
    return firstInput - secondInput;
  }
  public static int funcionQueMultiplica(int firstInput, int secondInput){
    return firstInput * secondInput;
  }
  public static int funcionQueDivide(int firstInput, int secondInput){
    return firstInput / secondInput;
  }
}

/*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación matemática
 y deben devolver sus resultados para imprimirlos en el main. */