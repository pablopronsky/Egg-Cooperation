package Main;

import ParDeNumeros.ParDeNumeros;
import ParDeNumerosServicio.ParDeNumerosServicio;

public class Main {
  public static void main(String[] args) {
    
    ParDeNumerosServicio parDeNumerosServicio = new ParDeNumerosServicio();
    ParDeNumeros pene = parDeNumerosServicio.crearNumeros();
    
    parDeNumerosServicio.mostrarValores(pene);
    System.out.println("El mayor es: " + parDeNumerosServicio.devolverMayor(pene));
    parDeNumerosServicio.calcularPotencia(pene);
    parDeNumerosServicio.calcularRaiz(pene);
    
    System.out.println("El mayor es " + parDeNumerosServicio.devolverMayor(pene));
    ParDeNumeros nombre =
  }
}
