import com.pablopronsky.Account;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Account account = new Account("Pablo", 10000);

    System.out.print("Cuanto dinero quieres retirar?: ");
    account.setWithdrawAmount(scanner.nextInt());
    account.withdrawMoney();
  }
}