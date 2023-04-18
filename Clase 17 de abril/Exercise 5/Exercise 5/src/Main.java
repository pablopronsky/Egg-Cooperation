import java.util.Random;

public class Main {
  public static void main(String[] args) {

    Random random = new Random();
    int[][] matrix = new int[4][4];

    //System.out.println("La matriz original es: ");
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        matrix[i][j] = random.nextInt(18);
        //System.out.print("[" + matrix[i][j] + "]");
      }
      //System.out.println();
    }

    //System.out.println("La matriz traspuesta es: ");

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        //System.out.print("[" + matrix[j][i] + "]");
      }
      //System.out.println();
    }
    boolean resultado = esAntisimetrica(matrix);
    System.out.println(resultado);
  }
  public static boolean esAntisimetrica(int[][] matrix) {
    boolean esAntisimetrica = true;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] != -matrix[j][i]) {
          esAntisimetrica = false;
          break;
        }
      }
    }
    return esAntisimetrica;
  }
}
