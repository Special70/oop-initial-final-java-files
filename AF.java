// Transaction class

import java.util.Scanner;

public class AF {
    static Scanner input = new Scanner(System.in);

    public static void processSupplier() {

        System.out.println("SUPPLIER INFORMATION");
        System.out.print("First Name: ");
        String firstName = input.nextLine();
        System.out.print("Last Name: ");
        String lastName = input.nextLine();
        System.out.print("Contact Number: ");
        String contactNumber = input.nextLine();

        System.out.print("Which model do you want to supply [Fortuner/Hilux/Innova/Vios]: ");
        String model = input.nextLine();

        System.out.print("Which variant do you want to supply for " + model + ": [XE/G/V]: ");
        String variant = input.nextLine();

        System.out.print("How many quantities do you need? ");
        int quantity = input.nextInt();

        System.out.print("Are you sure [Y/N]: ");
        char confirm = input.next().charAt(0);
        
        if (confirm == 'Y' || confirm == 'y') {
            AB supplier = new AB(firstName, lastName, contactNumber, model, variant, quantity);
            supplier.displaySupplierInfo();
            System.out.println("Thank you for supplying at DL Auto Care!");
        }
    }

    public static void processBuyer() {
        System.out.println("BUYER INFORMATION");
        System.out.print("First Name: ");
        String firstName = input.nextLine();
        System.out.print("Last Name: ");
        String lastName = input.nextLine();
        System.out.print("Contact Number: ");
        String contactNumber = input.nextLine();

        System.out.print("Which model do you want to buy [Fortuner/Hilux/Innova/Vios]: ");
        String model = input.nextLine();

        if (model.equalsIgnoreCase("Fortuner")) {
            AE fortuner = new AE();
            fortuner.displayVariants();

            System.out.print("Enter choice: ");
            int choice = input.nextInt();
            double price = fortuner.getPrice(choice);

            System.out.print("How many quantity do you need? ");
            int quantity = input.nextInt();

            double totalCost = price * quantity;

            System.out.println("The total cost is: ₱ " + totalCost);
            System.out.print("Your payment: ₱ ");
            double payment = input.nextDouble();

            System.out.print("Are you sure [Y/N]: ");
            char confirm = input.next().charAt(0);

            if (confirm == 'Y' || confirm == 'y') {
                AC buyer = new AC(firstName, lastName, contactNumber, model, "G 4x2 MT", quantity, totalCost);
                buyer.displayReceipt();
                System.out.println("Thank you for buying at DL Auto Care!");
            }
        }
    }
}