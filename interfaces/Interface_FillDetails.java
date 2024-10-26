package interfaces;

// Functions required for the buyer/supplier data due to needing the following details
public interface Interface_FillDetails {
    public abstract void fillDetails(String firstNameArg, String lastNameArg, String contactNumberArg, String addressArg);
    public abstract void fillDetails(String firstNameArg, String lastNameArg, String contactNumberArg);

}