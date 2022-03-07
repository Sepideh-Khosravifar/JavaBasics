package com.syntax.class15;

public class HW3 {

	public static void main(String[] args) {
	//Create a String and print it in reverse order (Sunday → yadnuS).	
		
		String str = "Sunday";
		String reversedStr = "";
		
		for (int i=str.length()-1; i>=0; i--) {
			
			reversedStr = reversedStr + str.charAt(i);
			
			// we use charAt():
			//when we are interested to select the charaters in the words
			
		}
		
			System.out.println(reversedStr);
		
	}

}
