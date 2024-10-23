import menus.FrontMenu;
import menus.RoleSelection;
import menus.SupplierMenu;
import menus.buyer_utils.Purchase_Buyer;
import menus.supplier_utils.AddSupply_Supplier;
import menus.supplier_utils.CheckSupply_Supplier;
import utils.SystemFunctions;

public class Main {
    public static void main(String[] args) {

        do {
            switch (SystemFunctions.getCurrentMenu()) {
                // The enum constants are named based on the class file of the menus
                case FrontMenu: {
                    FrontMenu.openMenu();
                    break;
                }
                case RoleSelection: {
                    RoleSelection.openMenu();
                    break;
                }
                case SupplierMenu: {
                    SupplierMenu.openMenu();
                    break;
                }
                case CheckSupply_Supplier: {
                    CheckSupply_Supplier.openMenu();
                    break;
                }
                case AddSupply_Supplier: {
                    AddSupply_Supplier.openMenu();
                    break;
                }
                case Purchase_Buyer: {
                    Purchase_Buyer.openMenu();
                    break;
                }
                default: {
                    System.out.println(SystemFunctions.getCurrentMenu());
                    System.out.println("AN ERROR HAS OCCURED IN THE CODE. PLEASE DOUBLE CHECK ALL METHOD CALLS FOR SystemFunctions.changeMenu()");
                    SystemFunctions.shutDownProgram();
                    break;
                }
            }


        } while (SystemFunctions.getProgramStatus());

    }

}
