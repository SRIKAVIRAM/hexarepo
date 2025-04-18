package com.hexa.encap;

public class Flight {

    private int noOfPassengers;
    private String type;
    private String flightName;
    private int availableSeats;
    private String source;
    private String destination;

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int seats) {
        this.availableSeats = seats;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Flight [Passengers=" + noOfPassengers + 
               ", Type=" + type + 
               ", FlightName=" + flightName + 
               ", Seats=" + availableSeats + 
               ", Source=" + source + 
               ", Destination=" + destination + "]";
    }
}
