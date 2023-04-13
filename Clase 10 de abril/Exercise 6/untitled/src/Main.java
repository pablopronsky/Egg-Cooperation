import java.util.Scanner;

class Exercise6{

  public static void main(String[] args) {

    System.out.println("Ingrese un numero entero positivo: ");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    System.out.println("Ingrese otro numero entero positivo: ");
    int num1 = scanner.nextInt();
    int menu;

    do {
      System.out.println("Ingrese la opcion que desee: ");
      System.out.println("1.Sumar");
      System.out.println("2.Restar");
      System.out.println("3.Multi");
      System.out.println("4.Dividir");
      System.out.println("5.Salir");
      menu = scanner.nextInt();
      switch (menu) {
        case 1 ->
          System.out.println(num1 + num);
        case 2 ->
          System.out.println(num - num1);
        case 3 ->
          System.out.println(num * num1);
        case 4 ->
          System.out.println(num / num1);
        case 5 ->
          System.out.println("Saliendo...");
        default ->
          System.out.println("Opcion incorrecta");
      }
    } while (menu != 5);
  }
}