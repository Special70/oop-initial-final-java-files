package menus.buyer_utils;


import data.BuyerData;
import menus.parent_classes.FormFiller;

public class FormFiller_Buyer extends FormFiller{
    public static void openMenu() {
        String[] details = FormFiller.fillFormBuyer();
        BuyerData.dataObj.fillDetails(details[0], details[1], details[2], details[3]);

        
    }
}
