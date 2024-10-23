package menus.supplier_utils;
import java.util.Scanner;

import data.SupplierData;
import data.VehicleModelData;
import utils.SystemFunctions;
import utils.SystemVariables.MenuConstants;


public class CheckSupply_Supplier{
    private static Scanner scanner = new Scanner(System.in);
    public static void openMenu() {
        SystemFunctions.clearConsole();
        System.out.println("====================================================\r\n" + //
                           "| QUANTITY  | MODEL               | VARIANT        |\r");
                           
        for (String[] supplyDetails : SupplierData.records) {
            System.out.print("| "+supplyDetails[0]+" ".repeat(10-String.valueOf(supplyDetails[0]).length())); // For displaying amount
            System.out.print("| "+VehicleModelData.getModelFullName(supplyDetails[1])+" ".repeat(20-VehicleModelData.getModelFullName(supplyDetails[1]).length())); // For displaying model name
            System.out.print("| "+VehicleModelData.getVariant(supplyDetails[1], Integer.parseInt(supplyDetails[2]))+" ".repeat(15-VehicleModelData.getVariant(supplyDetails[1], Integer.parseInt(supplyDetails[2])).length())+"|"); // For displaying model variant
            System.out.println("");
        }
        


        System.out.println("===================================================="); //

        System.out.println("Enter anything to return to the menu.");
        scanner.nextLine();
        SystemFunctions.changeMenu(MenuConstants.SupplierMenu);
    }


}
