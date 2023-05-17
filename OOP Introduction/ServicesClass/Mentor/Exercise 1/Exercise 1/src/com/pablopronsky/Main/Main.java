package com.pablopronsky.Main;
import com.pablopronsky.Service.CarService;

public class Main {
  
  public static void main(String[] args) {
    
    CarService carService = new CarService();
    carService.createCar();
    carService.printCar();
    CarService carService1 = new CarService();
    carService1.createCar();
    carService1.printCar();
    
  }
  
}
 /* Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
    Crea clase de servicio con los métodos "ingresarCoche" y "mostrarCoche*/