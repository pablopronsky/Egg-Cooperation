package Main;

import Entities.Human;
import Services.HumanServices;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    int skinny = 0;
    int healthy = 0;
    int fats = 0;
    int adults = 0;
    int minors = 0;
    
    Scanner scanner = new Scanner(System.in);
    HumanServices humanService = new HumanServices();
    Human[] humansArray = new Human[4];
    int[] BMI = new int[4];
    boolean[] isAdult = new boolean[4];
    
    for (int i = 0; i < humansArray.length; i++) {
      humansArray[i] = humanService.createHuman();
      BMI[i] = humanService.calculateBMI(humansArray[i]);
      switch (BMI[i]) {
        case 1 -> {
          System.out.println("La persona esta gorduli");
          fats++;
        }
        case 0 -> {
          System.out.println("La persona esta en su peso ideal");
          healthy++;
        }
        default -> {
          System.out.println("La persona esta por debajo de su peso");
          skinny++;
        }
      }
      isAdult[i] = humanService.isAnAdult(humansArray[i]);
      if (isAdult[i])
        adults++;
       else
        minors++;
    }
    System.out.println("El promedio de personas con peso alto es: " + ((fats/4) *100));
    System.out.println("El promedio de personas con poco peso es: " + ((skinny/4) *100));
    System.out.println("El promedio de personas con peso ideal es: " + ((healthy/4) * 100));
    System.out.println("Son mayores: " + adults);
    System.out.println("Son menores: " + minors);
  }
}

