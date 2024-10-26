package data;

import interfaces.Interface_FillDetails;
import interfaces.Interface_GetDataMethods;
import menus.parent_classes.UserData;

public class BuyerData extends UserData implements Interface_FillDetails, Interface_GetDataMethods {

    @Override
    public String getFirstName() {return this.firstName;}

    @Override
    public String getLastName() {return this.lastName;}

    @Override
    public String getContactNumber() {return this.contactNumber;}

    @Override
    public String getAddress() {return this.address;}

    // this method is made just to make the ide shut up because buyer data needs the address arg too
    @Override
    public void fillDetails(String firstNameArg, String lastNameArg, String contactNumberArg) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fillDetails'");
    }

    // this would be the method you would want to use.
    @Override
    public void fillDetails(String firstNameArg, String lastNameArg, String contactNumberArg, String addressArg) {
        this.firstName = firstNameArg;
        this.lastName = lastNameArg;
        this.contactNumber = contactNumberArg;
        this.address = addressArg;
    }

    // nonstatic object owned by the class itself
    public static BuyerData dataObj = new BuyerData();
}
