// MainApp class

import utils.SystemFunctions;

import java.util.Scanner;

public class MainApp implements SystemFunctions {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        char userChoice;

        do {
            SystemFunctions.clearConsole();
            System.out.println("S   Supplier");
            System.out.println("B   Buyer");
            System.out.println("E   Exit");
            System.out.print("Are you a supplier or a buyer? [S/B] = ");
            userChoice = input.next().toUpperCase().charAt(0);

            switch (userChoice) {
                case 'S':
                    Transaction.processSupplier();
                    break;

                case 'B':
                    Transaction.processBuyer();
                    break;

                case 'E':
                    System.out.println("Thank you for visiting at DL Auto Care!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    SystemFunctions.delay(1);
            }
        } while (userChoice != 'E');
    }
}