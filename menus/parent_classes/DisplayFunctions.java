package menus.parent_classes;

import data.VehicleModelData;

public class DisplayFunctions {
    protected static void displayModels() {
        
            System.out.println("===========================");
            for (int i = 0; i < VehicleModelData.models.length; i++) {
                System.out.println("|    "+VehicleModelData.models[i][0]+"  "+VehicleModelData.models[i][1]);
            }
            System.out.println("===========================");
    }

    protected static void displayToyotaFortunerVariants(boolean displayPrice) {
            System.out.println("===========================");
            for (int i = 0; i < VehicleModelData.toyotaFortunerVariants.length; i++) {
                System.out.println("|    "+VehicleModelData.toyotaFortunerVariants[i][0]+"  "+VehicleModelData.toyotaFortunerVariants[i][1]+"    "+(displayPrice ? VehicleModelData.toyotaFortunerVariants[i][2] : ""));
            }
            System.out.println("===========================");
    }
    protected static void displayToyotaHiluxVariants(boolean displayPrice) {
            System.out.println("===========================");
            for (int i = 0; i < VehicleModelData.toyotaHiluxVariants.length; i++) {
                System.out.println("|    "+VehicleModelData.toyotaHiluxVariants[i][0]+"  "+VehicleModelData.toyotaHiluxVariants[i][1]+"    "+(displayPrice ? VehicleModelData.toyotaHiluxVariants[i][2] : ""));
            }
            System.out.println("===========================");
    }
    protected static void displayToyotaInnovaVariants(boolean displayPrice) {
            System.out.println("===========================");
            for (int i = 0; i < VehicleModelData.toyotaInnovaVariants.length; i++) {
                System.out.println("|    "+VehicleModelData.toyotaInnovaVariants[i][0]+"  "+VehicleModelData.toyotaInnovaVariants[i][1]+"    "+(displayPrice ? VehicleModelData.toyotaInnovaVariants[i][2] : ""));
            }
            System.out.println("===========================");
    }
    protected static void displayToyotaViosVariants(boolean displayPrice) {
            System.out.println("===========================");
            for (int i = 0; i < VehicleModelData.toyotaViosVariants.length; i++) {
                System.out.println("|    "+VehicleModelData.toyotaViosVariants[i][0]+"  "+VehicleModelData.toyotaViosVariants[i][1]+"    "+(displayPrice ? VehicleModelData.toyotaViosVariants[i][2] : ""));
            }
            System.out.println("===========================");
    }
}
