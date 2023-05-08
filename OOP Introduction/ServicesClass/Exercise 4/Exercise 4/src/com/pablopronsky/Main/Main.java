package com.pablopronsky.Main;

import com.pablopronsky.ServiceEntity.SquareRootService;

public class Main {
  public static void main(String[] args) {
    
    SquareRootService sqr = new SquareRootService();
    sqr.createSq();
    sqr.calcular();
  }
}
