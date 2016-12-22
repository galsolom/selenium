package javaCourse;

import org.apache.commons.lang3.RandomStringUtils;

public class Lesson2 {

	public static int[] getArray(int size){
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++){
			arr[i]=Integer.valueOf(RandomStringUtils.randomNumeric(3));
			
		}
		return arr;
	}
	public static void print(){
		print(1);
	
	}
	public static void print(int size){
		
		int[] arr= getArray(30);
		
		for(int i = 0;i < arr.length; i++){
			System.out.println(arr[i]);
	
		}
	}
	
	public static void main(String[] args){
	    print();
	}
	
}
