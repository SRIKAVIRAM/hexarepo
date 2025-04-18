package com.hexa.encap;

public class FlighMain {


	    public static String companyName;

	    private int noOfPassengers;
	    private String type;
	    private String flightName;
	    private int availableSeats;
	    private String source;
	    private String destination;

	    // Getters and setters...

	    @Override
	    public String toString() {
	        return "Flight [Passengers=" + noOfPassengers +
	               ", Type=" + type +
	               ", FlightName=" + flightName +
	               ", Seats=" + availableSeats +
	               ", Source=" + source +
	               ", Destination=" + destination + "]";
	    }

	    // Include all required getters and setters here...
	}
