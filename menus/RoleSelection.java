package menus;

import java.util.Scanner;

import utils.SystemFunctions;
import utils.SystemVariables.MenuConstants;

public class RoleSelection {
    private static Scanner scanner = new Scanner(System.in);
    public static void openMenu() {

        while (true) {
            SystemFunctions.clearConsole(); // Clear the console for a fresh menu display
            System.out.println("=================================\r\n" + //
                        "| Greetings, welcome to… |\r\n" + //
                        "| DL Auto Care! |\r\n" + //
                        "=================================\r\n" + //
                        "1.1 Supplier\r\n" + // Option for Supplier
                        "1.2 Buyer\r\n" + // Option for Buyer
                        "1.3 Back"); // Option to go back
            System.out.print("Enter choice: ");
            String userInput = scanner.nextLine().trim(); // Get user input
            switch (userInput) {
                case "1.1": {
                    SystemFunctions.changeMenu(MenuConstants.SupplierMenu); // Navigate to Supplier menu
                    return;
                }
                case "1.2": {
                    SystemFunctions.changeMenu(MenuConstants.Purchase_Buyer); // Navigate to Buyer menu
                    return;
                }
                case "1.3": {
                    SystemFunctions.changeMenu(MenuConstants.FrontMenu); // Navigate back to Front menu
                    return;
                }
                default: {
                    System.out.println("Invalid input. Please try again"); // Invalid input message
                    SystemFunctions.delay(1); // Delay before retry
                }
            }
        }
    }
}
