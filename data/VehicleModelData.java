package data;

public class VehicleModelData {

    // Array containing vehicle model codes and their respective full names
    public static String[][] models = new String[][]{
        {"F", "Toyota Fortuner"}, 
        {"H", "Toyota Hilux"}, 
        {"I", "Toyota Innova"}, 
        {"V", "Toyota Vios"}
    };

    // Array representing Toyota Fortuner variants with code, name, and price
    public static String[][] toyotaFortunerVariants = new String[][]{
        {"1", "2.4 G 4x2 MT", "1769000"},
        {"2", "2.4 G 4x2 AT", "1861000"},
        {"3", "2.4 V 4x2 AT", "2009000"},
        {"4", "2.8 Q 4x2 AT", "2209000"},
        {"5", "2.8 LTD 4x2 AT", "2400000"},
        {"6", "2.8 LTD 4x4 AT", "2563000"},
        {"7", "GR-S 4x4 2.8 AT", "2650000"}
    };

    // Array representing Toyota Hilux variants with code, name, and price
    public static String[][] toyotaHiluxVariants = new String[][]{
        {"1", "2.4 E 4x2 MT", "1312000"},
        {"2", "2.4 E 4x2 AT", "1392000"},
        {"3", "2.4 G 4x2 MT", "1390000"},
        {"4", "2.4 G 4x2 AT", "1466000"},
        {"5", "2.4 CONQUEST 4x2 AT", "1675000"},
        {"6", "2.8 CONQUEST 4x4 MT", "2003000"},
        {"7", "2.8 CONQUEST 4x4 AT", "2078000"},
        {"8", "2.8 GR-S 4x4 AT", "2192000"},
        {"9", "2.8 GR Sport AT", "2178000"}
    };

    // Array representing Toyota Innova variants with code, name, and price
    public static String[][] toyotaInnovaVariants = new String[][]{
        {"1", "2.8 J DSL MT", "1261000"},
        {"2", "2.8 XE AT", "1375000"},
        {"3", "2.8 E DSL AT", "1529000"},
        {"4", "2.8 G DSL MT", "1613000"},
        {"5", "2.8 G DSL AT", "1683000"},
        {"6", "2.8 V DSL AT", "1823000"}
    };

    // Array representing Toyota Vios variants with code, name, and price
    public static String[][] toyotaViosVariants = new String[][]{
        {"1", "1.3 J MT", "732000"},
        {"2", "1.3 XE CVT", "774000"},
        {"3", "1.3 XLE MT", "862000"},
        {"4", "1.3 XLE CVT", "902000"},
        {"5", "1.5 G MT", "979000"},
        {"6", "1.5 G CVT", "1039000"}
    };

    // Method to get the full name of the model based on its code
    public static String getModelFullName(String model) {
        switch (model) {
            case "F": return "Toyota Fortuner";
    
