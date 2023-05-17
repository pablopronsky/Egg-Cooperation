package com.pablopronsky.Service;

import com.pablopronsky.Entities.Car;

import java.util.Scanner;

public class CarService {
  Car car = new Car();
  public Car createCar(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese la marca del vehiculo: ");
    car.setCarMake(scanner.nextLine());
    System.out.println("Ingrese el modelo del vehículo");
    car.setCarModel(scanner.nextLine());
    System.out.println("Ingrese el precio del vehículo");
    car.setCarPrice(scanner.nextInt());
    return car;
  }
  
  public void printCar(){
    System.out.println(car.getCarMake());
    System.out.println(car.getCarModel());
    System.out.println(car.getCarPrice());
  }
  
  
}
/* Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
    Crea clase de servicio con los métodos "ingresarCoche" y "mostrarCoche*/
