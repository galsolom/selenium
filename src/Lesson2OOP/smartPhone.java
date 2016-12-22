package Lesson2OOP;

public class smartPhone extends smartDevice {

	String phoneCompany;
	public String getPhoneCompany() {
		return phoneCompany;
	}
	public void setPhoneCompany(String phoneCompany) {
		this.phoneCompany = phoneCompany;
	}
	public smartPhone(double oS, double oSversion, double screenSize, String name, String phoneCompany) {
		super(oS, oSversion, screenSize, name);
		// TODO Auto-generated constructor stub
	}

	
	
}
