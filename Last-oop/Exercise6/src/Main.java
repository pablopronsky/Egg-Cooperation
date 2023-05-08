import com.pablopronsky.Rectangle;

public class Main {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(4, 6);
    int area = rectangle.calculateArea();
    System.out.println("El area del rectangulo es: " + area);
  }
}
/*Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método
"calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6
y imprime el área del rectángulo.*/