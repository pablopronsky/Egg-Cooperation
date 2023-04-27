package com.pablopronsky;

import java.util.Scanner;

public class Points {
 double x1;
 double y1;
 double x2;
 double y2;

 public void creatingPoints(){
   Scanner scanner = new Scanner(System.in);
   System.out.print("Ingrese el valor de x1: ");
   x1 = scanner.nextDouble();
   System.out.print("Ingrese el valor de y1: ");
   y1 = scanner.nextDouble();
   System.out.print("Ingrese el valor de x2: ");
   x2 = scanner.nextDouble();
   System.out.print("Ingrese el valor de y2: ");
   y2 = scanner.nextDouble();
 }

 public void calculatingDistance(){
   double distanceBetweenPoints = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
   System.out.println("La distancia entre 'x' e 'y' es:  " + distanceBetweenPoints);
 }
}

