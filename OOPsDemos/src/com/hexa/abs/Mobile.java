package com.hexa.abs;

public class Mobile {
	String model;
	String brand;
	double price;
	public Mobile(String model,String brand,double price) {
		this. model=model;
		this. brand=brand;
		this. price=price;	
		}
void printDetails() {
	System.out.println("model"+model);
	System.out.println("brand"+brand);
	System.out.println("price"+price); 
} 
void showFeatures() {
	System.out.println("Good storage,camera top quality");
}
String[] showAccessories( ){
	String[] accessories= {"Charger","Case"};
	return accessories;
	
}
}
