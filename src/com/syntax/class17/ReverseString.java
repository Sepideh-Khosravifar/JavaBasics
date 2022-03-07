package com.syntax.class17;

public class ReverseString {

	public static void main(String[] args) {
		
		
		        // How would you reverse a String word by word? for example
		        // input=>This is sentence i want to reverse
		        // output=>sihT si ecnetnes i tnaw ot esrever


		        String s = "Sunday is great";
		        
		        ReverseString task4=new ReverseString();

		        System.out.println(task4.reverseString(s));
		       
		        String [] strArray=s.split(" ");                            //split the string into words first
		       
		        for (int i=0; i <strArray.length; i++) {                    //s:"Sunday is great" strArray: ["Sunday". "is", "great"]
		            System.out.println(task4.reverseString(strArray[i] + " "));

		            }
		        }

		        String reverseString (String inputString) {
		        
		        StringBuilder stringBuilder = new StringBuilder(inputString);
		        
		        stringBuilder.reverse();
		        
		        return stringBuilder.toString();

		    

		
		
		

	}

}
