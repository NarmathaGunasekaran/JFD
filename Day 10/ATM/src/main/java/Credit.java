import java.util.Scanner;

public class Credit {
    private int amount;
    public Credit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount you credit: ");
        int amount = scanner.nextInt();
        int bal = Balance.balance();
        int fbal = bal + amount;
        System.out.println(fbal);
    }
}
