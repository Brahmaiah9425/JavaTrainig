package org.example;

public class Traveler {
	Vehicle vehicle;
	public Traveler(Vehicle vehicle) {
		this.vehicle = vehicle;
		}
	public void startJourney() {
		vehicle.move();
	}
}
