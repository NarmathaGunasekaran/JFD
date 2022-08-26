import java.security.Provider;
import java.util.Scanner;

public class Withdrawl {
    public Withdrawl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your amount");
        int amount = scanner.nextInt();
        int balance1 = Balance.balance();
        int withdrawl = balance1 - amount;
        System.out.println(withdrawl);
    }
}



