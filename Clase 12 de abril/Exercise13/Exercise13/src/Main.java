import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("Hola, escribí un entero entre 1 y 8: ");
    Scanner scanner = new Scanner(System.in);
    int numInput = scanner.nextInt();
    if (numInput < 1 || numInput > 8) {
      System.out.println("Escribí un entero entre el 1 y el 8");
      numInput = scanner.nextInt();
    }
    for (int i = 1; i <= numInput; i++) {
      for (int j = 1; j < i; j++){
        System.out.print(j);
      }
      System.out.println(i);
    }
    System.out.println("");
  }
}

/*Crear un programa que dibuje una escalera de números,
donde cada línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar.
Ejemplo: si se ingresa el número 3:
1
12
123
*/