// Toyota Fortuner class

public class ToyotaFortuner extends Vehicle {

    @Override
    public void displayVariants() {
        System.out.println("|-----------------------------------------------------|");
        System.out.println("|  1    Variant G 4x2 MT     ₱ 1,769,000.00  |");
        System.out.println("|  2    Variant G 4x2 AT     ₱ 1,861,000.00  |");
        System.out.println("|  3    Variant V 4x2 AT     ₱ 2,009,000.00  |");
        System.out.println("|-----------------------------------------------------|");
    }

    @Override
    public double getPrice(int choice) {
        switch (choice) {
            case 1:
                return 1769000.00;
            case 2:
                return 1861000.00;
            case 3:
                return 2009000.00;
            default:
                return 0.0;
        }
    }
}