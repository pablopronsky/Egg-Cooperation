import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hola, ingresa a que moneda queres convertir tus EUR: ");
    System.out.println("Para convertir a dolares (tasa de conversion: 0.86), escribí 'USD': ");
    System.out.println("Para convertir a libras esterlinas (tasa de conversion: 1.28), escribí 'GBP': ");
    System.out.print("Para convertir a yenes (tasa de conversion: 129.85), escribí 'JPY': ");
    Scanner scanner = new Scanner(System.in);
    String inputDivisa = scanner.nextLine();
    System.out.println("Estas a punto de convertir EUR a " + inputDivisa);
    System.out.print("Cuantos EUR queres convertir a " + inputDivisa + " ?: ");
    int cantidadAConvertir = scanner.nextInt();
    funcionQueConvierteDivisas(inputDivisa.toUpperCase(),cantidadAConvertir);
    System.out.println("Hasta la proxima.");
  }
  public static void funcionQueConvierteDivisas(String inputDivisa, int cantidadAConvertir){
    switch (inputDivisa) {
      case "USD" -> System.out.println("Ahora tienes: " + (cantidadAConvertir * 0.86) + inputDivisa);
      case "GBP" -> System.out.println("Ahora tienes: " + (cantidadAConvertir * 1.28) + inputDivisa);
      case "JPY" -> System.out.println("Ahora tienes: " + (cantidadAConvertir * 129.85) + inputDivisa);
    }
  }
}

/*Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda,
estas pueden ser a dólares, yenes o libras.
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena,
este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/