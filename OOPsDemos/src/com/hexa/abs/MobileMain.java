package com.hexa.abs;

public class MobileMain {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("A16", "Apple", 90000) {
            @Override
            String[] showAccessories() {
                return new String[]{"Charger", "Earphones", "Cover"};
            }
        };

        mobile.printDetails();
        mobile.showFeatures();
        String[] accessories = mobile.showAccessories();
        for (String item : accessories) {
            System.out.println(item);
        }
    }
}
