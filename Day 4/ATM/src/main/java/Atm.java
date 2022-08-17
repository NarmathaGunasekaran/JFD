import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Menu menuObj = new Menu();
        Withdrawal withdrawal = new Withdrawal();
        Credit credit = new Credit();
        CheckBalance checkBalance = new CheckBalance();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            menuObj.displayMenu();
            int choose = scanner.nextInt();
            switch (choose) {
                case (1):
                    int amount = withdrawal.withdarwal();
                    if (Utils.balance >= amount) {
                        Utils.balance = Utils.balance - amount;
                        System.out.println("Balance :" + Utils.balance);
                    } else {
                        System.out.println("Insufficient Balance");
                        System.exit(0);
                    }
                    break;
                case (2):
                    System.out.println("Balance :" + credit.credit());
                    break;
                case (3):
                    System.out.println("Balance :" + checkBalance.checkBalance());
                    break;
                case (4):
                    System.out.println("Thank you");
                    System.exit(0);
                default:
                    System.out.println("Invalid");
            }

        }
    }

}

