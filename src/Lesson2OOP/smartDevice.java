package Lesson2OOP;

public class smartDevice extends Product {
    
	String name;
	
	double OS;
	
	double OSversion;
	
	double screenSize;

	public double getOS() {
		return OS;
	}

	public void setOS(double oS) {
		OS = oS;
	}

	public double getOSversion() {
		return OSversion;
	}

	public void setOSversion(double oSversion) {
		OSversion = oSversion;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public smartDevice(double oS, double oSversion, double screenSize, String name) {
		super();
		this.OS = oS;
	    this.OSversion = oSversion;
		this.screenSize = screenSize;
		this.name = name;
		
	}


}
