package com.Exercise2.Entities;

public class CoffeeMaker {
  private int maximumCapacity;
  private int currentAmountOfCoffee;
  
  public CoffeeMaker(int maximumCapacity, int currentAmountOfCoffee) {
    this.maximumCapacity = maximumCapacity;
    this.currentAmountOfCoffee = currentAmountOfCoffee;
  }
  
  public CoffeeMaker() {
  }
  
  public int getMaximumCapacity() {
    return maximumCapacity;
  }
  
  public void setMaximumCapacity(int maximumCapacity) {
    this.maximumCapacity = maximumCapacity;
  }
  
  public int getCurrentAmountOfCoffee() {
    return currentAmountOfCoffee;
  }
  
  public void setCurrentAmountOfCoffee(int currentAmountOfCoffee) {
    this.currentAmountOfCoffee = currentAmountOfCoffee;
  }
  
}

