// Transaction class

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import utils.SystemFunctions;

public class Transaction implements SystemFunctions {
    static Scanner input = new Scanner(System.in);

    public static void processSupplier() {
        String firstName = "";
        String lastName = "";
        String contactNumber = "";
        String model = "";
        String variant = "";
        int quantity;
        while (true) {
            SystemFunctions.clearConsole();
            System.out.println("SUPPLIER INFORMATION");
            System.out.print("First Name: "+firstName);
            // first name input
            firstName = firstName.length() == 0 ? input.nextLine().trim() : firstName;
            if (firstName.length() <= 0) {
                System.out.println("Invalid input. Please try again");
                SystemFunctions.delay(1);
                continue;
            } else System.out.println("\n");

            // last name input
            System.out.print("Last Name: "+lastName);
            lastName = lastName.length() == 0 ? input.nextLine().trim() : lastName;
            if (lastName.length() <= 0) {
                System.out.println("Invalid input. Please try again");
                SystemFunctions.delay(1);
                continue;
            } else System.out.println("\n");

            // contact no. input
            System.out.print("Contact Number: ");
            contactNumber = contactNumber.length() == 0 ? input.nextLine().trim() : contactNumber;
            if (contactNumber.length() <= 0) {
                System.out.println("Invalid input. Please try again");
                SystemFunctions.delay(1);
                continue;
            } else System.out.println("\n");

            // model input
            System.out.print("Which model do you want to supply [Fortuner/Hilux/Innova/Vios]: ");
            model = model.length() == 0 ? input.nextLine().trim() : model;
            // List var to hold choices to check for
            List<String> modelList = Arrays.asList(new String[]{"fortuner", "hilux", "innova", "vios"});
            if (model.length() <= 0 || !(modelList.contains(model))) {
                System.out.println("Invalid input. Please try again");
                SystemFunctions.delay(1);
                continue;
            }

            System.out.print("Which variant do you want to supply for " + model + ": [XE/G/V]: "+variant);
            if (variant.length() <= 0) {
                variant = input.nextLine();
            }

            System.out.print("How many quantities do you need? ");
            try {
                quantity = input.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again");
                SystemFunctions.delay(1);
                continue;
            }

            

            System.out.print("Are you sure [Y/N]: ");
            char confirm = input.next().charAt(0);
        
            if (confirm == 'Y' || confirm == 'y') {
                Supplier supplier = new Supplier(firstName, lastName, contactNumber, model, variant, quantity);
                supplier.displaySupplierInfo();
                System.out.println("Thank you for supplying at DL Auto Care!");
            }
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
            ToyotaFortuner fortuner = new ToyotaFortuner();
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
                Buyer buyer = new Buyer(firstName, lastName, contactNumber, model, "G 4x2 MT", quantity, totalCost);
                buyer.displayReceipt();
                System.out.println("Thank you for buying at DL Auto Care!");
            }
        }
    }
}