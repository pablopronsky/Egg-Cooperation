import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    System.out.println("Hola! Te ayudaré a calcular tu tarifa.");
    System.out.print("Primero, indicame si eres socio de tipo 'A', 'B', o 'C': ");
    Scanner scanner = new Scanner(System.in);
    String tipoDeSocio = scanner.nextLine();
    int costoFinal = 0;
    if (tipoDeSocio.equals("A") ||tipoDeSocio.equals("B") || tipoDeSocio.equals("C")) {
      System.out.print("Excelente, ahora indique el costo de su tratamiento: ");
      int tratamiento = scanner.nextInt();
      switch (tipoDeSocio) {
        case "A" -> costoFinal = (tratamiento * 50) / 100;
        case "B" -> costoFinal = (tratamiento * 35) / 100;
        case "C" -> costoFinal = tratamiento;
      }
      System.out.println("Usted deberá abonar: " + costoFinal + ", que se mejore!.");
    }else
      System.out.println("Error, opcion ingresada inválida. Vuelva a ejecutar el programa.");

  }
}

/*Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del
tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.*/