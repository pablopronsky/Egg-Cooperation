package Services;

import Entities.Human;
import java.util.Scanner;

public class HumanServices {
  Scanner scanner = new Scanner(System.in).useDelimiter("\n");
  
  // metodo crear humano
  public Human createHuman(){
    Human human = new Human();
    //nombre
    System.out.print("Hola, dime el nombre de tu humano: ");
    human.setName(scanner.nextLine());
    // edad
    System.out.print("Ahora, ingresa la edad: ");
    human.setAge(scanner.nextInt());
    // genero
    System.out.print("Ahora, ingresa el genero, 'm' para mujer, 'h' para hombre, y 'o' para otros. ");
    human.setGender(scanner.next());
    String humanGender = String.valueOf(human.getGender());
    if (!(humanGender.equalsIgnoreCase("m") || humanGender.equalsIgnoreCase("h")
        || humanGender.equalsIgnoreCase("o"))){
      System.out.println("El genero que elegiste no está disponible, intentá nuevamente");
      human.setGender(scanner.next());
    }
    // altura
    System.out.print("Ingrese la altura de su humano en metros: ");
    human.setHeight(scanner.nextDouble());
    if (human.getHeight() < 0){
      System.out.print("Su persona no puede medir negativo, intente devuelta: ");
      human.setHeight(scanner.nextDouble());
    }
    // peso
    System.out.print("Ingrese el peso de su humano en kilos: ");
    human.setWeight(scanner.nextDouble());
    if (human.getWeight() < 0){
      System.out.println("Su humano no es antigravitatorio, intente de vuelta: ");
      human.setWeight(scanner.nextDouble());
    }
    return human;
  }
  
  // metodo es mayor de edad
  public boolean isAnAdult(Human human){
    return human.getAge() > 18;
  }
  
  //metodo IMC
  public int calculateBMI(Human human){
    double healthyWeight = (human.getWeight() / (human.getHeight() * createHuman().getHeight()));
    if (healthyWeight < 20){
      System.out.println("Estas bajo tu peso ideal.");
      return -1;
    } else if (healthyWeight < 25 || healthyWeight > 20){
      System.out.println("Estas en tu peso ideal.");
      return 0;
    }else {
      System.out.println("Anda al gym");
      return 1;
    }
  }
}
