package menus;

import java.util.Scanner;

import utils.SystemFunctions;
import utils.SystemVariables.MenuConstants;

public class SupplierMenu {
    private static Scanner scanner = new Scanner(System.in);
    public static void openMenu() { 
        
        while (true) {
            SystemFunctions.clearConsole();
            System.out.println("=================================\r\n" + //
                        "| Greetings, welcome to… |\r\n" + //
                        "| DL Auto Care! |\r\n" + //
                        "=================================\r\n" + //
                        "1.1.1 Add Supply\r\n" + //
                        "1.1.2 Check Supply\r\n" + //
                        "1.1.3 Back\r\n" );
            System.out.print("Enter choice: ");
            String userInput = scanner.nextLine().trim();
            switch (userInput) {
                case "1.1.1": {
                    SystemFunctions.changeMenu(MenuConstants.AddSupply_Supplier);
                    return;
                }
                case "1.1.2": {
                    SystemFunctions.changeMenu(MenuConstants.CheckSupply_Supplier);
                    return;
                }
                case "1.1.3": {
                    // back
                    SystemFunctions.changeMenu(MenuConstants.RoleSelection);
                    return;
                }
                default: {
                    System.out.println("Invalid input. Please try again");
                    SystemFunctions.delay(1);

                }
            }


        }
        


    }
    
}
