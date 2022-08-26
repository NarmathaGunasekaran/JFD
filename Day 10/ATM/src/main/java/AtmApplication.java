import java.util.Scanner;

public class AtmApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Withdrawal");
        System.out.println("2. Credit");
        System.out.println("3. Balance");
        System.out.println("4. Exit");
        System.out.println("Enter Your Choice");
        int choice = scanner.nextInt();
        while (true) {
            switch (choice) {
                case 1: {
                    Withdrawl withdrawl = new Withdrawl();
                    System.out.println(withdrawl);
                    break;
                }
                case 2: {
                    Credit credit = new Credit();

                    System.out.println(Credit.class);
                    break;
                }
                case 3: {
                    ;
                    System.out.println(Balance.balance());
                    break;
                }
                case 4: {
                    System.exit(0);
                    System.out.println("EXIT");
                    break;
                }
            }
        }
    }
}