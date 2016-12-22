package Lesson2OOP;

public class backPack extends Product{

	int litres = 5;
	int size;
	String color;
	public int getLitres() {
		return litres;
	}
	public void setLitres(int litres) {
		this.litres = litres;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public backPack(int litres, int size, String color) {
		super();
		this.litres = litres;
		this.size = size;
		this.color = color;
	}
	
	public backPack(int litres){
		this.litres = litres;
	}
	public backPack(){
		
	}
	
}
