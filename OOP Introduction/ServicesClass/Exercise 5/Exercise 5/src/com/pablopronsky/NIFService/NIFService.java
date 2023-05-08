package com.pablopronsky.NIFService;

import com.pablopronsky.NIF.NIF;

import java.util.Scanner;

public class NIFService {
  
  Scanner scanner = new Scanner(System.in);
  int placeInVector;
  long id;
  
  //crear nif
  public NIF createNIF(){
    NIF nif = new NIF();
    System.out.print("Ingresa tu DNI: ");
    nif.setDNI(scanner.nextLong());
    id = nif.getDNI();
    if (id < 0){
      System.out.println("Su dni no puede ser menor a 0. Vuelva a ejecutar el programa");
      System.exit(0);
    }
    return new NIF();
  }
  
  // que letra se le asigna
  public char whichLetter() {
    placeInVector = (int) (id % 23);
    char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J',
        'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    System.out.println("Su DNI completo sería: " + id + "-" + letras[placeInVector]);
    return letras[placeInVector];
  }
  
  // muestra el nif completo
  public void mostrar() {
    NIF nif = createNIF();
    char letra = whichLetter();
    nif.setLetter(letra);
    String nifCompleto = nif.getDNI() + "-" + Character.toUpperCase(nif.getLetter());
    //System.out.println("Su NIF es: " + nifCompleto);
  }
}
