package com.hexa.overriding;


	public class Scooty extends TwoWheeler {
	    String Color ;

	    public Scooty(String model, String brand, int price) {
	        super(model, brand, price);
	    }

		@Override
		void getMileage() {
			System.out.println("good mileage:60km/l");
		}
		@Override
		String[] showAccessories() {
			return new String[] {"Break","Seat Cover"};
		}

	}   


