package com.pablopronsky.Entitie;

import java.util.Scanner;

public class Course {
  Scanner scanner = new Scanner(System.in);
  private String courseName;
  private int hoursPerDay;
  private int daysPerWeek;
  private char shifts;
  private int pricePerHour;
  private String [] students = new String[5];
  
  public Course() {
  }
  
  public Course(String courseName, int hoursPerDay, int daysPerWeek, char shifts,
                int pricePerHour, String[] students) {
    this.courseName = courseName;
    this.hoursPerDay = hoursPerDay;
    this.daysPerWeek = daysPerWeek;
    this.shifts = shifts;
    this.pricePerHour = pricePerHour;
    this.students = students;
  }
  
  public String getCourseName() {
    return courseName;
  }
  
  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }
  
  public int getHoursPerDay() {
    return hoursPerDay;
  }
  
  public void setHoursPerDay(int hoursPerDay) {
    this.hoursPerDay = hoursPerDay;
  }
  
  public int getDaysPerWeek() {
    return daysPerWeek;
  }
  
  public void setDaysPerWeek(int daysPerWeek) {
    this.daysPerWeek = daysPerWeek;
  }
  
  public char getShifts() {
    return shifts;
  }
  
  public void setShifts(char shifts) {
    this.shifts = shifts;
  }
  
  public int getPricePerHour() {
    return pricePerHour;
  }
  
  public void setPricePerHour(int pricePerHour) {
    this.pricePerHour = pricePerHour;
  }
  
  public String[] getStudents() {
    return students;
  }
  
  public void setStudents(String[] students) {
    this.students = students;
  }
  // add students
  public void addStudents(Course course){
    String [] array = new String[5];
    for (int i = 0; i < getStudents().length; i++) {
      System.out.println("Hola, ingresa el nombre del alumno numero " + (i+1));
      array[i] = scanner.nextLine();
    }
    setStudents(array);
  }
  
  // create course
  public void createCrouse(){
    System.out.println("Hola, introduzca el nombre de su curso: ");
    setCourseName(scanner.nextLine());
    
    System.out.println("Cuantas horas por día tendra el curso?: ");
    setHoursPerDay(scanner.nextInt());
    
    System.out.println("Cuantos dias semanales llevará el curso?: ");
    setDaysPerWeek(scanner.nextInt());
    System.out.println("Será turno mañana (m) o turno tarde (t)? : ");
    setShifts(scanner.next().toLowerCase().charAt(0));
    
    if (getShifts() != 't' && getShifts() != 'm'){
      System.out.println("Respuesta incorrecta, vuelva a ingresar: ");
      setShifts(scanner.next().toLowerCase().charAt(0));
    }
    
    System.out.println("Cuanto valdrá por hora su curso?: ");
    setPricePerHour(scanner.nextInt());
    scanner.nextLine();
    addStudents(this);
  }
  
  public void weeklyEarnings(){
    System.out.println("Las ganancias semanales seran: $" + (5*getDaysPerWeek()*getHoursPerDay()*getPricePerHour()));
  }
  
}
