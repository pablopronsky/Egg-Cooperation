package com.pablopronsky.ServiceAccounts;

import com.pablopronsky.BankAccounts;
import java.util.Scanner;

public class BankAccountService {
  int accountBalance;
  int clientID;
  int accountID;
  Scanner scanner = new Scanner(System.in).useDelimiter("\n");

  public BankAccounts signUp(){
    BankAccounts bankAccounts = new BankAccounts();
    System.out.println("Hola, estas a punto de registrarte en el sistema. Por favor, ingrese su numero de cuenta");
    accountID = scanner.nextInt();
    System.out.println("Ahora, ingrese su numero de DNI");
    clientID = scanner.nextInt();
    System.out.println("Por último, ingrese los fondos que depositará");
    accountBalance = scanner.nextInt();
    return new BankAccounts(accountID, clientID, accountBalance);
  }

  public int deposit(){
    System.out.println("Ingrese la cantidad de dinero que depositará");
    accountBalance =accountBalance + scanner.nextInt();
    System.out.println("Su saldo actual es: " + accountBalance);
    return accountBalance;
  }

  public int withdraw(){
    System.out.println("Ingrese la cantidad de dinero a retirar");
    int pendingToWithdraw = scanner.nextInt();
    if (pendingToWithdraw >= accountBalance) {
      System.out.println("No tienes saldo suficiente, retirarás el total de tu dinero.");
      return 0;
    }
    accountBalance = accountBalance - pendingToWithdraw;
    System.out.println("Haz retirado $" + pendingToWithdraw + " y te quedan $" + accountBalance + " crocantes");
    return accountBalance;
  }

  public void quickWithdraw(){
    int quickWithdrawLimit = (int) (accountBalance * 0.2);
    System.out.println("Este es el sistema de retiro rapido de efectivo. Puede retirar hasta un 20%");
    int amount = scanner.nextInt();
    if (amount <= quickWithdrawLimit){
      System.out.println("Error, es más del 20% que puedes retirar.");
      return;
    }
    accountBalance = accountBalance - amount;
    System.out.println("Excelente, haz retirado $" + amount + " y te quedan $" + accountBalance);
  }

  public void checkFunds(){
    System.out.println("Su saldo actual es de $" + accountBalance);
  }

  public void checkInfo(){
    System.out.println("Su numero de cuenta es: " + accountID + ", el numero de DNI registrado en la cuenta es : " +
    clientID + ", y su saldo total es de $" + accountBalance);
  }
}
/*Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: numeroCuenta(entero),
* dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
*/