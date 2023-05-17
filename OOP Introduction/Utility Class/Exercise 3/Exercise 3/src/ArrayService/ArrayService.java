package ArrayService;

import java.util.Arrays;

public class ArrayService {
  
  public void initializeFirstsArray(double [] firstArray){
    for (int i = 0; i < firstArray.length; i++) {
      firstArray[i] = Math.round(Math.random()*10);
    }
  }
  
  public void printArray(double[] firstArray){
    System.out.println("Array: " + Arrays.toString(firstArray));
  }
  
  public void sortArray(double [] firstArray){
    Arrays.sort(firstArray);
    
    for (int i = 0; i < firstArray.length/2; i++) {
      int aux = (int) firstArray[i];
      firstArray[i] = firstArray[firstArray.length - i - 1];
      firstArray[firstArray.length - i - 1] = aux;
    }
    System.out.println("Primer array ordenado de mayor a menor: " + Arrays.toString(firstArray));
  }
  
  public void initializeSecondArray(double [] firstArray, double [] secondArray){
    for (int i = 0; i <= 10; i++) {
      secondArray[i] = firstArray[i];
    }
    Arrays.fill(secondArray, 11, 20, 0.5);
    
    System.out.println("Segundo array:" + Arrays.toString(secondArray));
  }
  
  public void printArray2(double[] secondArray){
    System.out.println("secondArray: " + Arrays.toString(secondArray));
  }
}
