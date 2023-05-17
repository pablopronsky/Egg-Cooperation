package com.pablopronsky.Entities;

public class Car {
  private String carMake;
  private String carModel;
  private int carPrice;
  
  public Car() {}
  
  public String getCarMake() {
    return carMake;
  }
  
  public void setCarMake(String carMake) {
    this.carMake = carMake;
  }
  
  public String getCarModel() {
    return carModel;
  }
  
  public void setCarModel(String carModel) {
    this.carModel = carModel;
  }
  
  public int getCarPrice() {
    return carPrice;
  }
  
  public void setCarPrice(int carPrice) {
    this.carPrice = carPrice;
  }
  
}
/* Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
    Crea clase de servicio con los métodos "ingresarCoche" y "mostrarCoche*/
