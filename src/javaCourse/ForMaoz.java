package javaCourse;

import org.apache.commons.lang3.RandomStringUtils;

public class ForMaoz {

	public static void main(String[] args) {
		int max=0;
		int min=100;
		// initiating an Array of integers at the size of 6 placements.
        int[] intArr2 = new int[100];

        // starting a for loop that's filling up the array index each loop with 2 numerical string converted to 
        // integers.
            for (int i = 0; i < intArr2.length; i++) {
            	intArr2[i]= Integer.parseInt(RandomStringUtils.randomNumeric(2));
            	if(intArr2[i]>max){
            		max=intArr2[i];
            	}
               if(intArr2[i]<min){
            	   min=intArr2[i];
            	   
               }
               
                // filling up the index with the random numbers 
              
// printing the 2 numberical integers each loop.
                System.out.println(intArr2[i]);

            }
            
            
            for(int i=0;i<10;i++){
            	System.out.println(intArr2[i]);
            }
            
            System.out.println("min int in the array" + min);
            System.out.println("Max int in the array" + max);
            
            
	}
	

}
