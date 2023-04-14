import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("Hola! para iniciar el programa escribi 'si' y para salir escribi 'no': ");
    Scanner scanner = new Scanner(System.in);
    String nombre = "";
    int edad = 0;
    String inputMenu = scanner.nextLine();
    while (inputMenu.equalsIgnoreCase("si")) {
      System.out.println("Ingresa el nombre de la persona: ");
      nombre = scanner.nextLine();
      System.out.print("Ingresa la edad de la persona: ");
      edad = scanner.nextInt();
      scanner.nextLine(); // Consumir el carácter de nueva línea
      registroDePersonas(nombre, edad);
      System.out.println("Quieres seguir agregando personas?");
      inputMenu = scanner.nextLine();
      if (inputMenu.equalsIgnoreCase("no")) {
        System.out.println("Saliendo..");
        System.exit(0);
      }
    }
    scanner.close();
  }
    private static void registroDePersonas (String nombre,int edad){
      if (edad >= 18) {
        System.out.println(nombre + " es mayor de edad");
      } else
        System.out.println(nombre + " es menor de edad");
    }
  }

/*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado
e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al usuario
 si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.*/

