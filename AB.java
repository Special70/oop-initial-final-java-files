// Supplier class

public class AB extends AA {
    private String model;
    private String variant;
    private int quantity;

    public AB(String firstName, String lastName, String contactNumber, String model, String variant, int quantity) {
        super(firstName, lastName, contactNumber);
        this.model = model;
        this.variant = variant;
        this.quantity = quantity;
    }

    public void displaySupplierInfo() {
        System.out.println("SUPPLIER INFORMATION");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Contact Number: " + getContactNumber());
        System.out.println("Supplying Model: " + model);
        System.out.println("Supplying Variant: " + variant);
        System.out.println("Quantity: " + quantity);
    }
}
