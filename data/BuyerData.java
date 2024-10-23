package data;

public class BuyerData {
    public static String firstName;
    public static String lastName;
    public static String contactNumber;
    public static String address;

    public static void fillDetails(String firstNameArg, String lastNameArg, String contactNumberArg, String addressArg) {
        firstName = firstNameArg;
        lastName = lastNameArg;
        contactNumber = contactNumberArg;
        address = addressArg;
    }
}
