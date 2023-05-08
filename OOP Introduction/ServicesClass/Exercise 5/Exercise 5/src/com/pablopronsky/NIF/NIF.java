package com.pablopronsky.NIF;

public class NIF {
  private long DNI;
  private char letter;
  
  public NIF(long DNI, char letter) {
    this.DNI = DNI;
    this.letter = letter;
  }
  
  public NIF() {
  }
  
  public long getDNI() {
    return DNI;
  }
  
  public void setDNI(long DNI) {
    this.DNI = DNI;
  }
  
  public char getLetter() {
    return letter;
  }
  
  public void setLetter(char letter) {
    this.letter = letter;
  }
}
