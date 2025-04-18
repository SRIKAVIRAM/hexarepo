package com.hexa.basics;

public class Switchcase {
public static void main(String[] args) {
	String choice= "Rainy";
	
	
	switch(choice) {
	case "Rainy":
        System.out.println("Drink Hot Tea");
        break;
    case "Summer":
        System.out.println("Eat Ice Cream");
        break;
    case "Winter":
        System.out.println("Drink Soup");
        break;
    case "Spring":
        System.out.println("Enjoy the Beauty of Flowers");
        break;
    default:
        System.out.println("Wrong Choice");	
		
	}
		
}
}
