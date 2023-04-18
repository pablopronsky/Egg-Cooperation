import java.util.Random;

public class Main {
  public static void main(String[] args) {

    Random random = new Random();
    int[][] matrix = new int [4][4];

    System.out.println("La matriz original es: ");
    for (int i = 0; i < 4; i++){
      for (int j = 0; j < 4; j++){
        matrix[i][j] = random.nextInt(18);
        System.out.print("[" + matrix[i][j] + "]");
      }
      System.out.println();
    }

    System.out.println("La matriz traspuesta es: ");
    
    for (int i = 0; i < 4; i++){
      for (int j = 0; j < 4; j++){
        System.out.print("[" + matrix[j][i] + "]");
      }
      System.out.println();
    }
  }
}

/*
* Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.
* La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas
* (o viceversa)*/