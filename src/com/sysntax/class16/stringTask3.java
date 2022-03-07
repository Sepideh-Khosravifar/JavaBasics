package com.sysntax.class16;

public class stringTask3 {

	public static void main(String[] args) {
		
		
		//You have a String a= ”Is it saturday? Is it 
		//raining? Do we have a Java Class today?” 
		//How would you find out how many 
		//sentences are in that String?
		
		String s= "Is it saturday? Is it raining? Do we have a Java class today?";
		
 
		System.out.println(s.length()); //String class method to count number of characters in a class.
		
				
		System.out.println(s.split("[?!.]").length);//length property 
		//that we use to check the number of sentences in an array.
		
	}

}
