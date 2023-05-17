package DateService;

import java.util.Date;
import java.util.Scanner;

public class DateService {
  Scanner scanner = new Scanner(System.in);
  
  public Date birthDay(){
    
    System.out.println("Ingrese su año de nacimiento: ");
    int year = scanner.nextInt() - 1900;
    
    System.out.println("Ingrese su mes de nacimiento: ");
    int month = scanner.nextInt() - 1;
    if (month == 0 || month > 12){
      System.out.println("Mes incorrecto, ingreselo nuevamente: ");
      month = scanner.nextInt() - 1;
    }
    
    System.out.println("Ingrese su dia de nacimiento");
    int day = scanner.nextInt();
    if (day == 0 || day < 0 || day > 31){
      System.out.println("Dia incorrecto, ingreselo nuevamente: ");
      day = scanner.nextInt() ;
    }
    return new Date (year, month, day);
  }
  
  public Date actualDate() {
    return new Date();
  }
  
  public int yearDifference(Date birthDay, Date actualDate) {
    int birthYear = birthDay.getYear();
    int actualYear = actualDate.getYear();
    
    return actualYear - birthYear;
  }
  
}
/*Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService,
en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento.
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual.
Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y
retorna la diferencia de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
*/