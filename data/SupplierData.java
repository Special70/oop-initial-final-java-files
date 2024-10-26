package data;

import java.util.ArrayList;

import interfaces.Interface_FillDetails;
import interfaces.Interface_GetDataMethods;
import menus.parent_classes.UserData;

public class SupplierData extends UserData implements Interface_FillDetails, Interface_GetDataMethods {

    @Override
    public String getFirstName() {return this.firstName;}

    @Override
    public String getLastName() {return this.lastName;}

    @Override
    public String getContactNumber() {return this.contactNumber;}

    @Override
    public String getAddress() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fillDetails'");
    }

    // written here to make the ide shut up
    @Override
    public void fillDetails(String firstNameArg, String lastNameArg, String contactNumberArg, String addressArg) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fillDetails'");
    }

    // this will be the function that you will be using
    @Override
    public void fillDetails(String firstNameArg, String lastNameArg, String contactNumberArg) {
        this.firstName = firstNameArg;
        this.lastName = lastNameArg;
        this.contactNumber = contactNumberArg;
    }

    public ArrayList<String[]> records = new ArrayList<>(); 

    public static SupplierData dataObj = new SupplierData();
}
