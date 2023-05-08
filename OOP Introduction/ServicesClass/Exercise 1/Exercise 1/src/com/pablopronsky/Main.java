package com.pablopronsky;

import com.pablopronsky.ServiceAccounts.BankAccountService;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    BankAccountService bankAccountService = new BankAccountService();
    bankAccountService.signUp();
    
    int menu;
    do {
      System.out.println();
      System.out.println("**********************");
      System.out.println("1) Estado de cuenta");
      System.out.println("2) Informacion del usuario");
      System.out.println("3) Depositar");
      System.out.println("4) Retirar dinero");
      System.out.println("5) Retiro rápido");
      System.out.println("6) Salir");
      System.out.println("**********************");
      Scanner scanner = new Scanner(System.in);
      menu = scanner.nextInt();

      switch (menu) {
        case 1:
          bankAccountService.checkFunds();
          break;
        case 2:
          bankAccountService.checkInfo();
          break;
        case 3:
          bankAccountService.deposit();
          break;
        case 4:
          bankAccountService.withdraw();
          break;
        case 5:
          bankAccountService.quickWithdraw();
        case 6:
          System.out.println("Hasta luego!.");
          System.exit(0);
      }
    }while((menu != 6));
  }
}
/*
* Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: numeroCuenta(entero),
* dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
*/