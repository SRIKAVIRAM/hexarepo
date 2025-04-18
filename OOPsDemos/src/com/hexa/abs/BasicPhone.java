package com.hexa.abs;

public class BasicPhone extends Mobile {
    public BasicPhone(String model, String brand, double price) {
        super(model, brand, price);
        // TODO Auto-generated constructor stub
    }

    @Override
    void showFeatures() {
        System.out.println("Sturdy Set, Has Payment options, Has Slither game");
    }

    @Override
    String[] showAccessories() {
        String[] accessories = {"Charger"};
        return accessories;
    }
}
	

