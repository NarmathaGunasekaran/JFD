import java.util.Scanner;

public class Credit {

    public int credit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Amount");
        int amount = scanner.nextInt();
        Utils.balance = Utils.balance + amount;
        return Utils.balance;
    }

}
