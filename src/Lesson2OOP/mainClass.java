package Lesson2OOP;

import java.util.ArrayList;
import java.util.List;

public class mainClass {
// 1. Create a class called "Basket" that can hold products for a specific buyer
// 2. Add these capabilities to the Basket class: add item, remove item, calculate basket total price.



	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
//		Boat boat = new Boat(1000);
//        
//        boat.setEngineType("diesel");
//        
//        System.out.println(boat.getPrice());
//        
//        boat.setPrice(9999);
//        
//        System.out.println(boat.getPrice());
//        
//        System.out.println(boat.engineType);
//        
//        Boat boat2 = new Boat(new String[]{"a","b"}, "asd", "asd");
//
//        boat2.move(434.23, 1.1);
//        
//        boat=boat2;
//        
//        System.out.println(boat.getEngineType());
//        System.out.println(boat2.getEngineType());
//       
//        
//        
//        smartPhone LG = new smartPhone(1.1,2.0,3, "LG5","Samsung");
//        System.out.println(LG.getName()+LG.getOS());
//        LG.setName("LG6");
//        LG.setOS(4);
//        System.out.println(LG.getName() + LG.getOS() + " " + LG.getPhoneCompany());
       
        
        
        
        
        
        
        
        
  /*     smartPhone phone1 = new smartPhone(0, 0, 0);
       
       
       
       
        phone1.setPrice(100);
        phone1.setDiscount(0.5);
        System.out.println(phone1.getPrice());
        System.out.println(phone1.sale(30));
        
    
 */
    	List<Product> devices = new ArrayList<Product>();
  	smartPhone iPhone = new smartPhone(1, 2, 3, "XX", "IPhone6");
  	smartPhone iPhone1 = new smartPhone(1, 2, 3, "X1X", "IPhone6");
  	iPhone.setPrice(30);
  	iPhone1.setPrice(31);
  devices.add(0,iPhone);
  devices.add(1,iPhone1);
 
  System.out.println(devices.get(0).getName());

  Basket b = new Basket();
	  
  for(int i=0;i<10;i++){
	  b.addItem(iPhone1);
	  
  }
  
	 b.addItem(iPhone);
	 b.addItem(iPhone1);
	 
	 for(int i = 0; i<b.BasketSize(); i++){
		 
		 i=i+1;
		b.RemoveItem(i);
		
	 }
	 
	 for( int i = 0; i<b.BasketSize();i++){
		 System.out.println(b.Pname(i));
	 }
	 System.out.println(b.getTotal());
  
//for (Product p : devices){
//	System.out.println(p.getName());
//}
//        
        
}
}