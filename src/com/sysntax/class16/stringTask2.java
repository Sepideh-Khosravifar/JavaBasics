package com.sysntax.class16;

public class stringTask2 {

	public static void main(String[] args) {
		
		//Create a String that should be combination 
		//of letters, numbers and special characters. 
		//Find out how many alpha characters are 
		//there in the String.

		
	String s = "hshajsAAHSH1221342754@#$%^&";
		
	System.out.println(s.length());
	
	System.out.println(s.replaceAll("[^A-Za-z0-9@#]", "").length());
	
		
				
	}
	
	
}
