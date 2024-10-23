package data;

import java.util.ArrayList;

public class SupplierData {
    public static String firstName;
    public static String lastName;
    public static String contactNumber;

    public static void fillDetails(String firstNameArg, String lastNameArg, String contactNumberArg) {
        firstName = firstNameArg;
        lastName = lastNameArg;
        contactNumber = contactNumberArg;
    }

    public static ArrayList<String[]> records = new ArrayList<>(); 
}
