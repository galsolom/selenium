package Lesson2OOP;

import java.util.ArrayList;
import java.util.List;


// Only properties.

public class Basket  {
final int x = 1;

	public 	List<Product> devices;
	
	//public List<String> devlist = new ArrayList<String>();
	
	
	public Basket(){
	
		devices = new ArrayList<Product>();
		
	}
	
public void addItem(Product p){
	devices.add(p);
	
}
// total price of the basket's products
public int getTotal(){
	
	int total = 0;
	// riding on the list's index and adding all prices into total
	for(int i = 0;i<devices.size();i++){
	
		total = total + devices.get(i).getPrice();
	}
	
	return total;
}
public String Pname(int i){
	String name = devices.get(i).getName();
	return name;
}
public int BasketSize(){
	int size = devices.size();
	return size;
	
}

public void RemoveItem(int i){
	
	devices.remove(i);
 
}
	
	
	
	//public void addItem(smartDevice b){
//		devices.add(b);
	//x}
	
		
	
	
	
	
	
	
}

	
	


