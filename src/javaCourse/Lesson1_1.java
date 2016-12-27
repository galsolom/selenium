/* package javaCourse;
import org.apache.commons.lang3.RandomStringUtils;

import j
// import org.apache.commons.lang3.RandomStringUtils;

public class Lesson1_1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
/// integer
        int intA = 300;

        intA = intA + 300;

        intA++;

        System.out.println(intA);
// this reduction applies only inside the Syso
        System.out.println(intA - 5);

        // intA=intA-5;
// this would print the last intA result (intA+300+1)
        System.out.println(intA);
// declaring an int (a whole number), it isn't declared null means it has some "garbage" value
        int a;

        // int a=intA;
// turning string "7777" into an intger using Interger.valueOf(); if it consists letters it'll throw exception/error
        int b = Integer.valueOf("7777");

        System.out.println(b);
// declaring double data type that CAN be a whole number but usually will be used with numbers after the pont for ex 1.23
        double amount = 0;

        amount = 1.777;

        amount = amount * 3;

        amount = amount - 1.2;
// Math.round(); rounds the number up or down(needs to be checked*****) like 1.99 to 2 // or 1.01 to 1;
        amount = Math.round(amount);

        System.out.println(amount);
// boolean data type is like bit, true or false 0 or 1.
        boolean isTrue = false;
// == means equals and = is for declaring a data type such - int = a OR String = "";
        // this if else decision makin will turn true to false and false to true.
        if (isTrue == true) {
            isTrue = false;
        } else {
            isTrue = true;
        }

        if (isTrue) {

        }
// in an if() we can throw many conditions and terms || means OR && means AND
        if (intA == 1 || intA == 2 && isTrue == true) {

            System.out.println("cond1");
        } else if (intA == 4) {

            if (isTrue == false) {

            }

        } else {
            System.out.println("aaaa");
        }
// String is not a primitive data type, its an object, thus, you can't string.equal between strings but only between 
// the same data type for example***  needs to be explained again
         //String strA = "a";
         String strA = new String();
         strA = "a";
          String strB = new String();
        	  strA = "a";
          
         if(strA==strB){
        	 System.out.println("equal");
        	 
         }
         else{
        	 System.out.println("not fucking equal");
         }
    }
}
         /* 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         
        // if (str1.equals("a")) {
        //
        // }
        //
        // if (str1.equals(null)) {
        //
        // }

        // String str2 = null;

        // if (str1.equals("aaa")) {
        //
        // }
        String str1 = "aaa";
        String str2 = "aaa";

        if (str1 == str2) {
            System.out.println("str 1 and str2 are equal");
        }

        if (str1.equals(str2)) {
            System.out.println("str 1 and str2 are equal");
        }

        String str3 = "";

        String str4 = "aaaaa";

        System.out.println(str4.length());
// some common java methods to be used in selenium mostly
        //.length(); gives off the length of given string
        // String strSub=str1.length();
        //
        //.contains gives off true or false if given string contains given values
        // str2.contains(s)
        //
        //.indexOf(ch); gives off the number of characters until we get to our desired ch 
        //
        // for example 
        // String maoz = "smadja";
        // System.out.println(maoz.indexOf(j));
        // it will print out 4 because in java it starts counting from 0
        // 0 1 2 3 4 5
        // s m a d j a
        //the character j sits at placement 4.
        
        // str3.indexOf(ch)
        //
        // str3.compareToIgnoreCase(str)
// .trim(); takes off specific value off your string, for example
        // String maoz = new String("smadja");
        // maoz.trim("a");
        // System.out.println(maoz);
        // output: smdj
        str4.trim();

        //replacing 1 string with another, replace all "a" with "x"
        //maoz.replace("a", "x");
        //System.out.println(maoz):
        //output: smxdjx
        str1.replace(" ", "");

        // needs explanation*******
        // str3.split(regex);
        
        // adding string to your string
        // maoz.concat(" hagever")
        // System.out.println(maoz)
        // output: smadja hagever
        str2.concat("addd");
 d
       //whats the difference between int[] intArr and int intArr[]
        
        int[] intArr = new int[] { 1, 2, 4, 5, 6 };

        int[] intArr2 = new int[4];

        String[] strArr = new String[] { "a", "b", "c", null, "" }

        
            for (int i = 0; i < 6; i++) {

                intArr2[i] = i;
                
                RandomStringUtils.randomAlphabetic(1);

                System.out.println(strArr[i]);

            }
        }
        }
        
        
        int timeout=120;
        
        int elapasedTime;
        
        
        while(elapasedTime<timeout){
            
 //           if(serverIsUp()){
   //             break;
            }
     //       else{
                Thread.sleep(5000);
                elapasedTime=elapasedTime+5;
                
    }           
    
                //       if(gotException()){
    }         
}

}
         //   }
            
       // }
      /*  
        ///QA  STG PROD
        String env=getEnv();
        
        switch (env) {
        case "QA":
            ///for QA
            break;

        case "STG":
            ///for stg
            
            break;
        case "prod":
            
            break;
        default:
            
            //some default stuff
            break;
        }

    }

    private static String getEnv() {
        // TODO Auto-generated method stub
        return null;
    }

    private static boolean gotException() {
        // TODO Auto-generated method stub
        return false;
    }

    public void doSomething(){
        createUser("aaa", 3);
        
        cre
    }
    
    private boolean serverIsUp() {
        // TODO Auto-generated method stub

        doSomething();

        return false;
    }

    

    public boolean createUser(String str){
        
        
        System.out.println();
        ///sfdsafddsfdsf
        
        if(){
            return true;
        }
        else{
            return false;
        }
        
    }

    public boolean createUser(String str,int i){
        
        
        System.out.println();
        ///sfdsafddsfdsf
        
        if(){
            return true;
        }
        else{
            return false;
        }
        
    }

}

*/