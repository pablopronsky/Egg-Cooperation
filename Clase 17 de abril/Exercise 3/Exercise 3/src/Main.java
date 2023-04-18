import java.util.Random;

public class Main {

    public static void main(String[] args) {
      Random random = new Random();
      int n = 20;
      int [] newArray = new int [n];
      int unDigito = 0;
      int dosDigitos = 0;
      int tresDigitos = 0;
      int cuatroDigitos = 0;
      int cincoDigitos = 0;

      for (int i = 0; i < newArray.length; i++){
        newArray[i] = random.nextInt(99999);
      }
      for (int j : newArray) {
        if (j > 0 && j < 10) {
          unDigito++;
        } else if (j > 10 && j < 100) {
          dosDigitos++;
        } else if (j > 100 && j < 1000) {
          tresDigitos++;
        } else if ((j > 1000) && (j < 10000)) {
          cuatroDigitos++;
        } else cincoDigitos++;
      }
      System.out.println("En total hay " + unDigito + " numeros de 1 digito");
      System.out.println("En total hay " + dosDigitos + " numeros de 2 digitos");
      System.out.println("En total hay " + tresDigitos + " numeros de 3 digitos");
      System.out.println("En total hay " + cuatroDigitos + " numeros de 4 digitos");
      System.out.println("En total hay " + cincoDigitos + " numeros de 5 digitos");
    }
}

/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */