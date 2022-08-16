
import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Menu menuObj = new Menu();
        Calculator calculator = new Calculator();
        menuObj.displayMenu();

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice > 0 & choice <= 5) {

            switch (choice) {
                case (1):
                    System.out.println(calculator.Add());
                    break;
                case (2):
                    System.out.println(calculator.Sub());
                    break;
                case (3):
                    System.out.println(calculator.multi());
                    break;
                case (4):
                    System.out.println(calculator.div());
                    break;
                case (5):
                    System.out.println(calculator.mod());
                    break;

            }
        } else {
            System.out.println("error");
        }
    }
}
