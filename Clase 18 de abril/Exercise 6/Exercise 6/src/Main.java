import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] palabrasInput = new String[5];
    char[][] matrixSopaDeLetras = new char[20][20];
    int rows = (int) (Math.random() * 19);
    int columns = 0;

    // lee  las palabras y las ubica horizontalmente en la matriz
    for (int i = 0; i < 5; i++) {
      System.out.print("Ingrese la palabra " + (i + 1) + ": ");
      palabrasInput[i] = scanner.nextLine();
      rows = (int) (Math.random() * 19);
      while (palabrasInput[i].length() < 3 || palabrasInput[i].length() > 5) {
        System.out.print("La palabra debe tener entre 3 y 5 caracteres. Ingrese la palabra " + (i + 1) + ": ");
        palabrasInput[i] = scanner.nextLine();
      }

      // ubica la palabra en forma de caracteres en la matriz
      columns = (int) (Math.random() * (19 - palabrasInput[i].length() - 1));
      for (int j = 0; j < palabrasInput[i].length(); j++) {
        System.out.println(rows);
        matrixSopaDeLetras[rows][columns] = palabrasInput[i].charAt(j);
        columns++;
      }
      columns = 0;

    }
    // rellena el resto de la matriz con numeros random entre el 0 y 9
    for (int i = 0; i < matrixSopaDeLetras.length; i++) {
      for (int j = 0; j < matrixSopaDeLetras[i].length; j++) {
        if (matrixSopaDeLetras[i][j] == '\u0000') {
          matrixSopaDeLetras[i][j] = (char) ((int) (Math.random() * 10) + '0'); // el + 0 lo convierte a caracter ascii
        }
        System.out.print(matrixSopaDeLetras[i][j] + " ");
      }
      System.out.println();
   }
 }
}

/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando,
construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres.
Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria.
Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9.
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().
*/