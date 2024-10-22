// Buyer class

public class Buyer extends Person {
    private String model;
    private String variant;
    private int quantity;
    private double totalCost;

    public Buyer(String firstName, String lastName, String contactNumber, String model, String variant, int quantity, double totalCost) {
        super(firstName, lastName, contactNumber);
        this.model = model;
        this.variant = variant;
        this.quantity = quantity;
        this.totalCost = totalCost;
    }

    public void displayReceipt() {
        System.out.println("\nHere is your buyer’s receipt:");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Contact Number: " + getContactNumber());
        System.out.println("Model purchased: " + model);
        System.out.println("Variant purchased: " + variant);
        System.out.println("Payment: ₱ " + totalCost);
        System.out.println("Change: ₱ 0.00");
        System.out.println("Time issued: " + java.time.LocalTime.now());
        System.out.println("Date issued: " + java.time.LocalDate.now());
    }
}