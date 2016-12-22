package JUnitHW;
//Create a base test class. 
//The base test class should hold a user object with first name, last name, user id and address, phone
//In the setup, new user object is created with random data
// Create these tests:
//Check if first name is not null.
//Check if last name length is bigger then  4 chars
//Check that phone number contains area code
public class User {
	String Fname;
	String Lname;
	int UserID;
	String Address;
	String Phone;
	
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String string) {
		Phone = string;
	}
	public User(String fname, String lname, int userID, String address, String phone) {
		
	this.Fname = fname;
		this.Lname = lname;
		this.UserID = userID;
		this.Address = address;
		this.Phone = phone;
	}
	
}
