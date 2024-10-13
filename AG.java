// MainApp class

import java.util.Scanner;

public class AG {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        char userChoice;

        do {
            System.out.println("\nS   Supplier");
            System.out.println("B   Buyer");
            System.out.println("E   Exit");
            System.out.print("Are you a supplier or a buyer? [S/B] = ");
            userChoice = input.next().toUpperCase().charAt(0);

            switch (userChoice) {
                case 'S':
                    AF.processSupplier();
                    break;

                case 'B':
                    AF.processBuyer();
                    break;

                case 'E':
                    System.out.println("Thank you for visiting at DL Auto Care!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (userChoice != 'E' && userChoice != 'e');
    }
}