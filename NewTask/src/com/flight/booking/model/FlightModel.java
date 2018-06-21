package com.flight.booking.model;

public class FlightModel {
	private String flightname;
	private String source;
	private String destination;
	private double fare;
	private int noofseats;
	private String aircraftname;
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
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
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public int getNoofseats() {
		return noofseats;
	}
	public void setNoofseats(int noofseats) {
		this.noofseats = noofseats;
	}
	public String getAircraftname() {
		return aircraftname;
	}
	public void setAircraftname(String aircraftname) {
		this.aircraftname = aircraftname;
	}
	

}
