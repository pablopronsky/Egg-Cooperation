import java.util.Arrays;
import java.util.Random;

public class Main {
  public static void main(String[] args) {

    int [] newArray = new int[10];
    funcionQueLlenaVectores(newArray);

  }
  public static void funcionQueLlenaVectores(int[] newArray){
    Random random = new Random();
    for (int i = 0; i < newArray.length; i++){
      newArray[i] = random.nextInt(15);
    }
    funcionQueImprimeVectores(newArray);
  }
  public static void funcionQueImprimeVectores(int [] newArray){
    System.out.println(Arrays.toString(newArray));
  }
}
/*Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro.
Después haremos otra función o procedimiento que imprima el vector.
 */