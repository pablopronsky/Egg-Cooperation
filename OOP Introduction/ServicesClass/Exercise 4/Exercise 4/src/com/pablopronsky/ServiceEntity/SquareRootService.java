package com.pablopronsky.ServiceEntity;

import com.pablopronsky.Entity.SquareRoot;

import java.util.Locale;
import java.util.Scanner;

public class SquareRootService {
  
  Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
  double a;
  double b;
  double c;
  
  // create new square root
  public SquareRoot createSq(){
    SquareRoot sq = new SquareRoot();
    System.out.print("Inserte el valor de a: ");
    sq.setA(scanner.nextDouble());
    a = sq.getA();
    System.out.print("Inserte el valor de b: ");
    sq.setB(scanner.nextDouble());
    b = sq.getB();
    System.out.print("Inserte el valor de c: ");
    sq.setC(scanner.nextDouble());
    c = sq.getC();
    scanner.close();
    return sq;
  }
  
  // get discriminante
  public double getDiscriminant(){
  return (b * b) -4 * a * c;
  }
  
  // tiene raices
  public boolean hasSquareRoots(){
    return getDiscriminant() >= 0;
  }
  
  // tiene raiz
  public boolean hasSquareRoot(){
    return getDiscriminant() == 0;
  }
  
  // obtener raices
  public void getSquareRoots(){
    if (hasSquareRoots()){
      double firstSQ = (-b + Math.sqrt(getDiscriminant())) / (2 * a);
      double secondSQ = (-b - Math.sqrt(getDiscriminant())) / (2 * a);
      System.out.println("Las raíces son: " + firstSQ + " y " + secondSQ);;
    }
  }
  
  // obtener raiz
  public void getSquareRoot(){
    if (hasSquareRoot()){
      double squareRoot = -b / (2 * a);
      System.out.println("La raíz de x es = " + squareRoot);
    }
  }
  
  // calcular
  public void calcular() {
    if (hasSquareRoots()) {
      getSquareRoots();
    } else if (hasSquareRoot()) {
      getSquareRoot();
    } else {
      System.out.println("No tiene raices perro.");
    }
  }
}
