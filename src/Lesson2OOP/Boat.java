package Lesson2OOP;

public class Boat extends Vehicle {

	String[] Passengers;
	
	String licenseNumber;
	
	
	String engineType;
	
	public Boat(String[] passengers, String licenseNumber, String engineType) {
		super();
		Passengers = passengers;
		this.licenseNumber = licenseNumber;
		this.engineType = engineType;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public Boat(int price){
		setPrice(price);
		
	}

}
