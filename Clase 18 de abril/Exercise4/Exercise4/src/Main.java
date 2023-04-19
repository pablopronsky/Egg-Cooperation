import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int [][] alumnosConNotas = new int [10][5];
    double primerTrabajoEvaluativo = 0;
    double segundoTrabajoEvaluativo = 0;
    double primerIntegrador = 0;
    double segundoIntegrador = 0;

    // guardamos las notas del primer trabajo evaluativo en la primer fila del array
    for (int i = 0; i < 1; i++){
      for (int j = 0; j < 10; j++){
        System.out.println("Ingrese la nota del primer trabajo evaluativo del alumno " + j + ": ");
        primerTrabajoEvaluativo = scanner.nextDouble() * 0.1;
        alumnosConNotas[i][j] = (int) primerTrabajoEvaluativo;
      }
    }

    // guardamos las notas del segundo trabajo evaluativo en la segunda fila del array
    for (int i = 1; i < 2; i++){
      for (int j = 0; j < 10; j++){
        System.out.println("Ingrese la nota del segundo trabajo evaluativo del alumno " + j + ": ");
        segundoTrabajoEvaluativo = scanner.nextDouble() * 0.15;
        alumnosConNotas[i][j] = (int) segundoTrabajoEvaluativo;
      }
    }

    // guardamos las notas del primer integrador en la tercera fila del array
    for (int i = 2; i < 3; i++){
      for (int j = 0; j < 10; j++){
        System.out.println("Ingrese la nota del primer integrador del alumno " + j + ": ");
        primerIntegrador = scanner.nextDouble() * 0.25;
        alumnosConNotas[i][j] = (int) primerIntegrador;
      }
    }

    // guardamos las notas del segundo integrador en la cuarta fila del array
    for (int i = 3; i < 4; i++){
      for (int j = 0; j < 10; j++){
        System.out.println("Ingrese la nota del segundo integrador del alumno " + j + ": ");
        segundoIntegrador = scanner.nextDouble() * 0.5;
        alumnosConNotas[i][j] = (int) segundoIntegrador;
      }
    }

    // discriminamos cuantos alumnos aprobaron
    double promedioDeNotas = primerIntegrador + segundoIntegrador + primerTrabajoEvaluativo + segundoTrabajoEvaluativo;
    int aprobados = 0;
    for (int i = 5; i < 6; i++){
      for (int j = 0; j < 10; j++){
        if (promedioDeNotas > 7) {
          aprobados++;
        }
      }
    }

    // mostramos la cantidad de aprobados y desaprobados
    System.out.println("La cantidad de alumnos aprobados es: " + aprobados);
    System.out.println("La cantidad de alumnos desaprobados es: " + (10 - aprobados));
  }
}

/*Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos
para luego obtener una cantidad de aprobados y desaprobados.
Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales.
Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados,
teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
*/