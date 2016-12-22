package javaCourse;

import org.apache.commons.lang3.RandomStringUtils;

public class Lesson1Real {

	public static void main(String[] args) {
		
		String[] strings = new String[100];
	// placing random strings inside the string array using randomstringutils
		
		for(int i = 0; i < 100;i++){
		
		strings[i] = RandomStringUtils.randomAlphabetic(8);
		System.out.println(strings[i]);
		
		
		 
		     
			
		}
		String strA ="abcd";
		
		String strB = new String("abcd");
		
		if (strA==strB){
			System.out.println("==");
		}
		if(strA.equals(strB)){
			System.out.println("equals");
			
		
		}
		}
	}


