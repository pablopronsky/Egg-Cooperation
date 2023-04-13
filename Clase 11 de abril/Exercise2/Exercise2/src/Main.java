public class Main {
  public static void main(String[] args) {

    // declaracion de variables
    int a = 1, b = 2, c = 3, d = 4, aux;
    System.out.println("inicialmente, los valores son: a = "+ a + ", b = " + b + ", c = " + c + ", d = " + d);

    // asignacion que pide el enunciado
    aux = b;
    b = c;
    c = a;
    a = d;
    d = aux;

    // print del resultado con variables intercambiadas
    System.out.println("Finalmente, los valores son: a = "+ a + ", b = " + b + ", c = " + c + ", d = " + d);
  }
}

/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A,
A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable.
Utilizar sólo una variable auxiliar.
 */