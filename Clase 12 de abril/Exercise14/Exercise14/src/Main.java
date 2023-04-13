import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Bienvenido, el programa le irá guiando con instrucciones");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Para empezar, ingrese la cantidad de familias " +
      "sobre la que se realizará la estadística: ");
    int cantidadDeFamilias = scanner.nextInt();
    int hijosPorFamilia = 0;
    int edadDeCadaHijo = 0;
    int promedioDeEdades = 0;
    int i = 1;
    int j = 1;
    int edadPromedio = 0;
    int hijos = 0;
    for (i = 1; i <= cantidadDeFamilias; i++) {
      System.out.println("Ahora, ingrese la cantidad de hijos de la familia número " + i);
      hijosPorFamilia = scanner.nextInt();
      for (j = 1; j <= hijosPorFamilia; j++) {
        System.out.println("Ahora, ingrese la edad del hijo número " + j + " de la familia " + i + ": ");
        edadDeCadaHijo = scanner.nextInt();
        promedioDeEdades = promedioDeEdades + edadDeCadaHijo;
        hijos++;
      }
      edadPromedio = promedioDeEdades / hijos;
    }
    System.out.println("En total, se censaron " + (i - 1) + " familias, " + hijos + "" +
      " hijos en total, y la edad promedio de ellos es: " +
      (edadPromedio));
      scanner.close();
  }
}
/*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos.
Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos
para averiguar la media de edad de los hijos de todas las familias.*/