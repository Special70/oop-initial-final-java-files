package menus.buyer_utils;

import data.BuyerData;
import data.SupplierData;
import data.VehicleModelData;
import menus.parent_classes.DisplayFunctions;
import utils.SystemFunctions;
import utils.SystemVariables.MenuConstants;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public class Purchase_Buyer extends DisplayFunctions {
    private static Scanner scanner = new Scanner(System.in);
    public static void openMenu() {

        if (BuyerData.dataObj.getFirstName() == null) {
            FormFiller_Buyer.openMenu();
        }
        
        String model = "";
        String variant = "";
        int amount = 0;
        double payment = 0;
        String confirmation = "";
        String getReceipt = "";

        String[][] variantDetails;

        while (true) {
            SystemFunctions.clearConsole();

            DisplayFunctions.displayModels();
            System.out.print("Select a model: [F/H/I/V]: "+(model.length() <= 0 ? "" : model+"\n"));
            // ================================================================================================================================
            // Vehicle Model Handler
            if (model.length() <= 0) model = model.length() == 0 ? scanner.nextLine().toUpperCase().trim() : model;

            if (!("FHIV".contains(model))) {
                System.out.println("Invalid input. Try again");
                SystemFunctions.delay(1);
                // Resetter
                model = "";
                continue;
            } 

            
            // ================================================================================================================================
            // Vehicle Variant Handler
            variantDetails = VehicleModelData.toyotaFortunerVariants; // To make the compiler shut up for possible uninitialized values

            switch (model) {
                case "F": {
                    DisplayFunctions.displayToyotaFortunerVariants(true);
                    variantDetails = VehicleModelData.toyotaFortunerVariants;
                    break;
                }
                case "H": {
                    DisplayFunctions.displayToyotaHiluxVariants(true);
                    variantDetails = VehicleModelData.toyotaHiluxVariants;
                    break;
                }
                case "I": {
                    DisplayFunctions.displayToyotaInnovaVariants(true);
                    variantDetails = VehicleModelData.toyotaInnovaVariants;
                    break;
                }
                case "V": {
                    DisplayFunctions.displayToyotaViosVariants(true);
                    variantDetails = VehicleModelData.toyotaViosVariants;
                    break;
                }
            }
            
            System.out.print("Which variant will you buy? "+(variant.length() <= 0 ? "" : variant+"\n"));
            variant = variant.length() == 0 ? scanner.nextLine().toUpperCase().trim() : variant;
            try {
                int userInput = Integer.parseInt(variant);
                // Checks if the user input is 
                // - input is less than or equal to length 
                // - input is greater than 0
                if (!(userInput > 0 && userInput <= variantDetails.length)) {
                    throw new Exception("");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Try again");
                SystemFunctions.delay(1);
                // Resetter
                variant = "";
                continue;
            }
            // Time to properly save the user input
            variant = String.valueOf(
                Integer.parseInt(variant)
            );

            // ================================================================================================================================
            // Amount Handler
            try {
                System.out.print("How many quantities do you need? "+(amount == 0 ? "" : amount+"\n"));
                // Asks the user to input a value
                if (amount <= 0) {
                    String userInput = scanner.nextLine();
                    amount = Integer.parseInt(userInput);
                    if (amount <= 0) {
                        // Forces code to go to the catch block
                        throw new Exception("");
                    }
                } 
                
            } catch (Exception e) {
                System.out.println("Invalid input. Try again");
                SystemFunctions.delay(1);
                // Resetter
                amount = 0;
                continue;
            }

            // ================================================================================================================================
            // Cost Handler
            double totalCost = VehicleModelData.getVariantPrice(model, Integer.valueOf(variant)) * amount;
            System.out.println("The total cost is P"+String.format("%,.2f", totalCost));
            System.out.print("Your payment: "+(payment <= 0 ? "" : String.format("%,.2f", payment)));
            try {
                payment = payment <= 0 ? scanner.nextDouble() : payment;
                scanner.nextLine();
                if (payment < totalCost) {
                    System.out.println("Not enough money. Please enter a higher number");
                    SystemFunctions.delay(1);
                    // Resetter
                    payment = 0;
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Try again");
                SystemFunctions.delay(1);
                // Resetter
                payment = 0;
                continue;
            }

            
            // ================================================================================================================================
            // Confirmation Handler
            System.out.print("Are you sure [Yes/No]: ");
            confirmation = confirmation.length() == 0 ? scanner.nextLine().toLowerCase().trim() : confirmation;

            if (confirmation.equals("yes")) {
                // Continue
            } else if (confirmation.equals("no")) {
                System.out.println("Exiting menu...");
                SystemFunctions.delay(1);
                SystemFunctions.changeMenu(MenuConstants.RoleSelection);
                return;
            } else {
                System.out.println("Invalid input. Try again");
                SystemFunctions.delay(1);
                // Resetter
                confirmation = "";
                continue;
            }

            // ================================================================================================================================
            // Receipt Confirm
            System.out.print("Would you like a receipt? [Yes/No]: ");
            getReceipt = getReceipt.length() == 0 ? scanner.nextLine().toLowerCase().trim() : getReceipt;

            if (getReceipt.equals("yes")) {
                // Print Receipt below
            } else if (getReceipt.equals("no")) {
                System.out.println("Exiting menu...");
                SystemFunctions.delay(1);
                SystemFunctions.changeMenu(MenuConstants.RoleSelection);
                return;
            } else {
                System.out.println("Invalid input. Try again");
                SystemFunctions.delay(1);
                // Resetter
                getReceipt = "";
                continue;
            }

            
            // ================================================================================================================================
            // Printing Receipt
            SystemFunctions.clearConsole();
            System.out.println("BUYER'S RECEIPT");
            System.out.println("Name: "+BuyerData.dataObj.getFirstName()+" "+BuyerData.dataObj.getLastName());
            System.out.println("Contact Number: "+BuyerData.dataObj.getContactNumber());
            System.out.println("Address: "+BuyerData.dataObj.getAddress());
            System.out.println("Model Purchased: "+VehicleModelData.getModelFullName(model));
            System.out.println("Variant Purchased: "+VehicleModelData.getVariant(model, Integer.parseInt(variant)));
            System.out.println("Total Cost: P "+String.format("%,.2f", totalCost));
            System.out.println("Your Payment: P "+String.format("%,.2f", payment));
            System.out.println("Change: P "+String.format("%,.2f", payment-totalCost));
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss");  
            LocalDateTime now = LocalDateTime.now();  
            System.out.println("Date Issued: "+dtf.format(now));
            System.out.println("Time Issued: "+dtf2.format(now));

            System.out.println("\nThank you for buying at DL Auto Care!");
            System.out.println("");
            System.out.print("Enter anything to exit"); String dummy = scanner.nextLine();
            SystemFunctions.changeMenu(MenuConstants.FrontMenu);
            return;
        }
    }
}
