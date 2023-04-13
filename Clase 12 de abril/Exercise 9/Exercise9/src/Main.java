import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    System.out.println("Hola!, ingresá dos enteros y haré una resta sucesiva");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresá el divisor: ");
    int firstInput = scanner.nextInt();
    System.out.print("Ahora ingresá el dividendo: ");
    int secondInput = scanner.nextInt();
    if (secondInput == 0) {
      System.out.println("El dividendo no puede ser 0");
      return;
    }
    int cociente = 0;
    int firstInputActualizado = firstInput;
    while (secondInput <= firstInput) {
      firstInput = firstInput - secondInput;
      cociente++;
      int contadorDeResto = firstInput;
      if (firstInput < secondInput) {
        System.out.println("Al número "+ firstInputActualizado + " lo podes divir " + cociente + " veces por el numero "
          + secondInput + " y el resto de la divison es " +contadorDeResto);
        break;
      }
    }
  }
}