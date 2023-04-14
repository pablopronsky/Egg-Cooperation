import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("Hola! para iniciar el programa escribi '1' y para salir escribi '2': ");
    Scanner scanner = new Scanner(System.in);
    String nombre = "";
    int edad = 0;
    int inputMenu;
    inputMenu = scanner.nextInt();
    while (inputMenu == 1) {
      System.out.println("Ingresa el nombre de la persona: ");
      nombre = scanner.nextLine();
      System.out.print("Ingresa la edad de la persona: ");
      edad = scanner.nextInt();
      registroDePersonas(nombre, edad);
      System.out.println("Quieres seguir agregando personas?");
      inputMenu = scanner.nextInt();
    }
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

