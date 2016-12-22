package javaCourse;





import java.util.Arrays;


import org.apache.commons.lang3.RandomUtils;

public class drill2 {

	public static void main(String[] args) {
	
		int strArr1[] = new int[100];	
	int min1=100;
	int max1=0;
	
	    for(int i = 0;i < 100; i++ ){
	    	
	    	strArr1[i] = RandomUtils.nextInt(0,100);
	if(strArr1[i]<min1)    {
		
	}
	    	
	    
	   }
	    
	    System.out.println("The 10 first values on the unsorted Array are");
	    for(int l=0;l<9;l++){
	    	System.out.println(strArr1[l]);
	    }
	    
	    Arrays.sort(strArr1);
	    System.out.println("The 10 first values on the sorted Array are");
	    for(int l=0;l<9;l++){
	    	System.out.println(strArr1[l]);
	    }
	    int min = strArr1[0];
	    int max = strArr1[99];
	    System.out.println("Minimum value of the array=" + min);
	    System.out.println("Maximum value of the array=" + max);
   //     String arr = strArr1[0], strArr1[1];
	}

}
