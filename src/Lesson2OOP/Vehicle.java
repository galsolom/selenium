package Lesson2OOP;

abstract public class Vehicle {

	private double longtitude;
	
	private double Latitude;
	
	private double price;
	
	private int maxSpeed;

	public double getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(double longtitude) {
		this.longtitude = longtitude;
	}

	public double getAltitude() {
		return Latitude;
	}

	public void setAltitude(double altitude) {
		this.Latitude = altitude;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
public void move(double newLong, double newLate){
	this.longtitude = newLong;
	this.Latitude = newLate; 
}
	
}
