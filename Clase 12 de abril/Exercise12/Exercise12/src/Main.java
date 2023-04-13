public class Main {
  public static void main(String[] args) {

    for (int i = 0; i <= 3; i++) {
      for (int j = 0; j <= 3; j++) {
        for (int k = 0; k <= 3; k++) {


          String primerNum = Integer.toString(i);
          String segundoNum = Integer.toString(j);
          String tercerNum = Integer.toString(k);

          if (primerNum.equals("3")) {
            primerNum = "E";
          }

          if (segundoNum.equals("3")) {
            segundoNum = "E";
          }

          if (tercerNum.equals("3")) {
            tercerNum = "E";
          }

          System.out.println(primerNum + " " + segundoNum + " " + tercerNum);
        }
      }
    }
  }
}

/*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9,
con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
*/