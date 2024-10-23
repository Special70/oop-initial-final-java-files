package menus.supplier_utils;

import data.SupplierData;
import data.VehicleModelData;
import menus.parent_classes.DisplayFunctions;
import utils.SystemFunctions;
import utils.SystemVariables.MenuConstants;

import java.util.Scanner;

public class AddSupply_Supplier extends DisplayFunctions{
    private static Scanner scanner = new Scanner(System.in);
    public static void openMenu() {
        String model = "";
        String variant = "";
        int amount = 0;
        String confirmation = "";

        String[][] variantDetails;

        
        if (SupplierData.firstName == null) {
            FormFiller_Supplier.openMenu();
        }

        while (true) {
            SystemFunctions.clearConsole();
            
            DisplayFunctions.displayModels();
            System.out.print("Which model will you supply? [F/H/I/V]: "+(model.length() <= 0 ? "" : model+"\n"));
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
                    DisplayFunctions.displayToyotaFortunerVariants(false);
                    variantDetails = VehicleModelData.toyotaFortunerVariants;
                    break;
                }
                case "H": {
                    DisplayFunctions.displayToyotaHiluxVariants(false);
                    variantDetails = VehicleModelData.toyotaHiluxVariants;
                    break;
                }
                case "I": {
                    DisplayFunctions.displayToyotaInnovaVariants(false);
                    variantDetails = VehicleModelData.toyotaInnovaVariants;
                    break;
                }
                case "V": {
                    DisplayFunctions.displayToyotaViosVariants(false);
                    variantDetails = VehicleModelData.toyotaViosVariants;
                    break;
                }
            }
            
            System.out.print("Which variant? "+(variant.length() <= 0 ? "" : variant+"\n"));
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
            // Confirmation Handler
            System.out.print("Are you sure [Yes/No]: ");
            confirmation = confirmation.length() == 0 ? scanner.nextLine().toLowerCase().trim() : confirmation;

            if (confirmation.equals("yes")) {
                System.out.println("Request accepted!");
                System.out.println("Thank you for supplying at DL Auto Care!");

                // Adding record:
                SupplierData.records.add(new String[]{String.valueOf(amount), model, variant});

                SystemFunctions.changeMenu(MenuConstants.RoleSelection);
                SystemFunctions.delay(1);
                return;
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





            
        }


        
    }
}
