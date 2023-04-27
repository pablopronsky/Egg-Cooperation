package com.pablopronsky.oop;
public class Main {
  public static void main(String[] args) {
    /*Ejercicios de guía teórica
    Person pablo = new Person("Pablo", "Pronsky", 27);
    Person notPablo = new Person("Alberso", "Fernandez", 65);
    System.out.println(pablo.getAge() + " " + notPablo.getLastName());*/


    /* Ejercicio 1
    Scanner scanner = new Scanner(System.in);
    Books firstBook = new Books();

    System.out.print("Ingrese el ISBN del libro: ");
    firstBook.isbn = scanner.nextInt();
    System.out.print("Ingrese el título del libro: ");
    firstBook.title = scanner.nextLine();
    firstBook.title = scanner.nextLine();
    System.out.print("Ingrese el autor del libro: ");
    firstBook.author = scanner.nextLine();
    System.out.print("Ingrese la cantidad de páginas del libro: ");
    firstBook.totalBookPages = scanner.nextInt();

    System.out.println("El nombre del primer libro ingresado es: " + firstBook.title + ", el autor es "
      + firstBook.author + ", tiene " + firstBook.totalBookPages + " páginas, y su ISBN es: " + firstBook.isbn);*/

    /* Ejercicio 2
    Circumference circunferencia = new Circumference();
    System.out.println(circunferencia.area(155));
    System.out.println(circunferencia.perimetro(155));*/

     //Ejercicio 3
    Operation operation = new Operation();
    operation.crearOperacion();
    System.out.println("La suma de " + operation.getNumero1() + " + " + operation.getNumero2() +
    " es igual a: " + operation.sumar());
    System.out.println("La resta de " + operation.getNumero1() + " - " + operation.getNumero2() +
    " es igual a: " + operation.restar());
    System.out.println("La multiplicacion de " + operation.getNumero1() + " * " + operation.getNumero2() +
    " es igual a: " + (operation.multiplicar()));
    System.out.println("La division de " + operation.getNumero1() + " dividido " + operation.getNumero2() +
    " es igual a: " + operation.dividir());0

    /*Ejercicio 4
    Rectangle rectangle = new Rectangle();
    rectangle.rectangleCreator();
    rectangle.calculateSurface();
    rectangle.calculatePerimeter();
    rectangle.drawRectangle(); */

  }
}