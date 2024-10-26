package utils;

public class SystemVariables {
    // The reason why enum constants are used to specify menus in the program
    // is to be able to change all occurences of it if ever there are changes
    // in plans.
    public static enum MenuConstants {
        FrontMenu,
        RoleSelection,
        SupplierMenu,
        CheckSupply_Supplier,
        AddSupply_Supplier,
        Purchase_Buyer
        
    }
    // This is needed to be static so all parts of the codebase can access this variable as it NEEDS to be TRACKABLE.
    // 
    // REMOVING THIS VARIABLE MAY CAUSE SERIOUS ISSUES BECAUSE THIS VARIABLE IS IMPORTANT
    // WHEN IT COMES TO CONTROLLING WHICH MENU THE PROGRAM DISPLAYS WHEN THE USER EXITS
    // FROM THE CURRENT MENU.
    public static MenuConstants currentMenu = MenuConstants.FrontMenu;
    
    public static boolean isProgramRunning = true;
}
