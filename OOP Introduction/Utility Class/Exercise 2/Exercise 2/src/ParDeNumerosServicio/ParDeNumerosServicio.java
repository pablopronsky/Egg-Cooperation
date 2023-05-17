package ParDeNumerosServicio;


import ParDeNumeros.ParDeNumeros;

public class ParDeNumerosServicio {
  
  public ParDeNumeros crearNumeros() {
    ParDeNumeros pdn = new ParDeNumeros();
    return pdn;
  }
  public void mostrarValores(ParDeNumeros p){
    System.out.println("El primer valor es: " + p.getNum1() + " y el segundo valor es: " + p.getNum2());
  }
  
  public double devolverMayor(ParDeNumeros p){
    return Math.max(p.getNum1(), p.getNum2());
  }
  
  public void calcularPotencia(ParDeNumeros p){
    if (p.getNum1()> p.getNum2()) {
      System.out.println("La potencia es: " +Math.pow(p.getNum1(), p.getNum2()));
      return;
    }
      System.out.println("La potencia es: " +Math.pow(p.getNum2(), p.getNum1()));
  }
  
  public void calcularRaiz(ParDeNumeros p){
    if (p.getNum1()> p.getNum2()) {
      System.out.println("La raiz cuadrada del primer numero es: " + Math.sqrt(p.getNum1()));
    }
    else {
      System.out.println("La raiz cuadrada del segundo numero es: " + Math.sqrt(p.getNum2()));
    }
  }
  
}




/*Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:

Método mostrarValores que muestra cuáles son los dos números guardados.

Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor

Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número.
Previamente se deben redondear ambos valores.

Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
