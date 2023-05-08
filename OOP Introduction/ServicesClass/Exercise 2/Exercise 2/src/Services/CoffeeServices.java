package Services;

import java.util.Scanner;
import com.Exercise2.Entities.CoffeeMaker;

public class CoffeeServices {
  int coffeeCupSize;
  boolean isThereRoomForMoreCooffee;
  Scanner scanner = new Scanner(System.in);
  CoffeeMaker coffeeMaker = new CoffeeMaker(1000, 750);
  
  // metodo llenar cafetera
  public void fillCoffeeMaker(){
    coffeeMaker.setCurrentAmountOfCoffee(coffeeMaker.getMaximumCapacity());
    System.out.println("Cafetera llena.");
  }
  
  // metodo llenar taza
  public int fillCupOfCoffee(){
    do {
    System.out.print("Ingrese en ml el tamaño de su taza de café: ");
    coffeeCupSize = scanner.nextInt();
    }while ((coffeeCupSize <= 0));
    
    if (coffeeCupSize > coffeeMaker.getCurrentAmountOfCoffee()){
      System.out.println("No alcanzó el café, pero se sirvió todo. Tenes que volver a hacer café.");
    }else if (coffeeCupSize == coffeeMaker.getCurrentAmountOfCoffee()){
      System.out.println("Entró justo la cantidad que tenias. Tenes que volver a hacer café.");
    } else {
      coffeeMaker.setCurrentAmountOfCoffee(coffeeMaker.getCurrentAmountOfCoffee() - coffeeCupSize);
      System.out.printf("Taza llena. te quedan %d ml de café. %n", coffeeMaker.getCurrentAmountOfCoffee());
    }
    return coffeeCupSize;
  }
  
  // metodo vaciar cafetera
  public void EmptyCoffeeMaker(){
    coffeeMaker.setCurrentAmountOfCoffee(0);
    System.out.println("Cafetera vacía.");
  }
  
  //Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
  public int makeCoffee() {
    int roomForMoreCoffee = coffeeMaker.getMaximumCapacity() - coffeeMaker.getCurrentAmountOfCoffee();
    
    System.out.printf("Cuanto café queres hacer? la cafetera tiene %d ml libres%n", roomForMoreCoffee);
    int inputAmount = scanner.nextInt();
    isThereRoomForMoreCooffee = inputAmount <= roomForMoreCoffee;
    
    if (!isThereRoomForMoreCooffee) {
      System.out.printf("%d excede el cafe que le entra a la cafetera, acordate que podes poner hasta %d ml. %n", inputAmount, roomForMoreCoffee);
    } else {
      coffeeMaker.setCurrentAmountOfCoffee(coffeeMaker.getCurrentAmountOfCoffee() + inputAmount);
      System.out.println("Listo!, ahora la cafetera tiene " + coffeeMaker.getCurrentAmountOfCoffee() + " ml. ");
    }
    return 0;
  }
}