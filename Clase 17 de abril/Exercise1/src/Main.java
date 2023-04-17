public class Main {
  public static void main(String[] args) {

    int[] newArray = new int[100];
    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = i + 1;
    }
    for (int i = newArray.length -1 ; i >= 0c; i--) {
      System.out.println(newArray[i]);
    }
  }
}
/*Realizar un algoritmo que llene un vector con los 100 primeros números enteros
y los muestre por pantalla en orden descendente.
 */

