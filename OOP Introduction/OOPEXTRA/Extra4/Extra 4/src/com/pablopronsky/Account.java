package com.pablopronsky;

public class Account {

  int funds = 1000;
  String ownerId;
  int withdrawAmount;

  public Account(String ownerID, int funds) {
    this.setFunds(funds);
    this.setOwnerId(ownerID);
  }

  public Account() {

  }

  public int getFunds() {
    return funds;
  }

  public void setFunds(int funds) {
    this.funds = funds;
  }

  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public int getWithdrawAmount() {
    return withdrawAmount;
  }

  public void setWithdrawAmount(int withdrawAmount) {
    this.withdrawAmount = withdrawAmount;
  }

  public void withdrawMoney() {
    if ((funds - withdrawAmount) < 0)
      System.out.println("No podes tener saldo negativo. Votá mejor.");
    else{
      funds = funds - withdrawAmount;
      System.out.println("Te quedan " + funds + " pesos en la cuenta.");
  }
 }
}

/*Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". okk
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta.
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.*/
