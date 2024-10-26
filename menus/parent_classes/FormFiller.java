package menus.parent_classes;

import data.BuyerData;
import data.SupplierData;
import utils.SystemFunctions;

import java.util.Scanner;

public class FormFiller {
    protected static String[] fillFormSupplier() {
        Scanner scanner = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        String contactNumber = "";
        while (true) {
            SystemFunctions.clearConsole();
            System.out.println("=================================\r\n" + //
                                "|       SUPPLIER INFORMATION       |\r\n" + //
                                "=================================\r");
            System.out.print("First Name: "+firstName+(firstName.length() == 0  ? "" : "\n"));
            firstName = firstName.length() == 0 ? scanner.nextLine().trim() : firstName;
            if (firstName.length() == 0 ) {
                System.out.println("Invalid input. Please try again");
                SystemFunctions.delay(1);
                continue;
            }

            System.out.print("Last Name: "+lastName+(lastName.length() == 0  ? "" : "\n"));
            lastName = lastName.length() == 0  ? scanner.nextLine().trim() : lastName;
            if (lastName.length() == 0 ) {
                System.out.println("Invalid input. Please try again");
                SystemFunctions.delay(1);
                continue;
            }

            System.out.print("Contact Number: "+contactNumber+(contactNumber.length() == 0  ? "" : "\n"));
            contactNumber = contactNumber.length() == 0  ? scanner.nextLine().trim() : contactNumber;
            if (contactNumber.length() == 0 ) {
                System.out.println("Invalid input. Please try again");
                SystemFunctions.delay(1);
                continue;
            }
        
            SupplierData.dataObj.fillDetails(firstName, lastName, contactNumber);
            System.out.println("Done filling in data");
            SystemFunctions.delay(1);
            // Exit program
            return new String[]{firstName, lastName, contactNumber};

        }
    }

    protected static String[] fillFormBuyer() {
        Scanner scanner = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        String contactNumber = "";
        String address = "";
        while (true) {
            SystemFunctions.clearConsole();
            System.out.println("=================================\r\n" + //
                                "|       BUYER INFORMATION       |\r\n" + //
                                "=================================\r");
            System.out.print("First Name: "+firstName+(firstName.length() == 0  ? "" : "\n"));
            firstName = firstName.length() == 0 ? scanner.nextLine().trim() : firstName;
            if (firstName.length() == 0 ) {
                System.out.println("Invalid input. Please try again");
                SystemFunctions.delay(1);
                continue;
            }

            System.out.print("Last Name: "+lastName+(lastName.length() == 0  ? "" : "\n"));
            lastName = lastName.length() == 0  ? scanner.nextLine().trim() : lastName;
            if (lastName.length() == 0 ) {
                System.out.println("Invalid input. Please try again");
                SystemFunctions.delay(1);
                continue;
            }

            System.out.print("Contact Number: "+contactNumber+(contactNumber.length() == 0  ? "" : "\n"));
            contactNumber = contactNumber.length() == 0  ? scanner.nextLine().trim() : contactNumber;
            if (contactNumber.length() == 0 ) {
                System.out.println("Invalid input. Please try again");
                SystemFunctions.delay(1);
                continue;
            }

            System.out.print("Address Number: "+address+(address.length() == 0  ? "" : "\n"));
            address = address.length() == 0  ? scanner.nextLine().trim() : address;
            if (address.length() == 0 ) {
                System.out.println("Invalid input. Please try again");
                SystemFunctions.delay(1);
                continue;
            }
        
            BuyerData.dataObj.fillDetails(firstName, lastName, contactNumber, address);
            System.out.println("Done filling in data");
            SystemFunctions.delay(1);
            // Exit program
            return new String[]{firstName, lastName, contactNumber, address};

        }
    }
}
