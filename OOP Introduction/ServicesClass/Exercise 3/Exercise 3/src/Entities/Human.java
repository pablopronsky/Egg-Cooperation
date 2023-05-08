package Entities;

public class Human {
  private String name;
  private int age;
  private double weight;
  private String gender;
  private double height;
  
  public Human() {
  }
  
  public Human(String name, int age, double weight, String gender, double height) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.weight = weight;
    this.height = height;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public int getAge() {
    return age;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
  
  public double getWeight() {
    return weight;
  }
  
  public void setWeight(double weight) {
    this.weight = weight;
  }
  
  public String getGender() {
    return gender;
  }
  
  public void setGender(String gender) {
    this.gender = gender;
  }
  
  public double getHeight() {
    return height;
  }
  
  public void setHeight(double height) {
    this.height = height;
  }
}

