import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    System.out.println("Hola! soy un promediador de alturas y juzgador de enanos.");
    Scanner scanner = new Scanner(System.in);
    double altura;
    double centimetrosTotal = 0;
    int cantidadDePersonas = 0;
    int enanos = 0;
    boolean cierraPrograma;
    do {
      System.out.print("Ingresa la altura en centimetros de las personas que quieras, para finalizar, escribe '000': ");
      altura = scanner.nextDouble();
      if (altura == 000) {
        break;
      }
      if (altura < 160) {
        enanos++;
      }
      cierraPrograma = (altura != 000);
      centimetrosTotal = centimetrosTotal + altura;
      cantidadDePersonas++;
    } while (cierraPrograma);
    System.out.println("Excelente, has ingresado " + cantidadDePersonas + " que en promedio miden: " + (centimetrosTotal / cantidadDePersonas));
    System.out.println("Ademas, la cantidad de personas que miden menos de 1.60mts son : " + enanos);
  }
}