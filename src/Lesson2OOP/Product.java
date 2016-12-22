package Lesson2OOP;

abstract public class Product {
String name;
	int weight;
	int legnth;
	int highest;
	int width;
	int price;
	
	double discount;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getLegnth() {
		return legnth;
	}
	public void setLegnth(int legnth) {
		this.legnth = legnth;
	}
	public int getHighest() {
		return highest;
	}
	public void setHighest(int highest) {
		this.highest = highest;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double sale(double price){
	    price = price*this.discount;
	    
		return price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
