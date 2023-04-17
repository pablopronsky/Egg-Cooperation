import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int n = 20;
    int contador = 0;
    int[] newArray = new int[n];
    for (int i = 0; i < newArray.length; i++){
      newArray[i] = random.nextInt(10);
    }
    System.out.print("Ingresa un entero entre 1 y 10 y el programa te dirá en que posicion del vector se encuentra: ");
    int inputUsuario = scanner.nextInt();
    for (int i = 0; i < newArray.length; i++){
      if (inputUsuario == newArray[i]){
        contador++;
        System.out.println("El número " + inputUsuario + " se encuentra en el vector en la posicion " + i + " y se repite la cantidad de vez veces: " + contador);
      }
      if ((contador == 0) && (i == newArray.length - 1)) {
        System.out.println("El número " + inputUsuario + " no se encuentra en el vector");
      }
    }
  }
}
/*Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
y le pida al usuario un número a buscar en el vector.
El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */