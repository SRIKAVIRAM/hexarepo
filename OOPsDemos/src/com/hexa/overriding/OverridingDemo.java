package com.hexa.overriding;

public class OverridingDemo {
    public static void main(String[] args) {
        
        TwoWheeler wheeler1 = new Bike("Rx", "Bajaj", 90000);
        wheeler1.printDetails();
        wheeler1.getMileage();
        String[] bikeAccessories = wheeler1.showAccessories();
        for (String accessory : bikeAccessories) {
            System.out.println(accessory);
        }

        System.out.println();

       
        TwoWheeler wheeler2 = new Scooty("Pept", "Honda", 75000);
        wheeler2.printDetails();
        wheeler2.getMileage();
        String[] scootyAccessories = wheeler2.showAccessories();
        for (String accessory : scootyAccessories) {
            System.out.println(accessory);
        }
    }
}


