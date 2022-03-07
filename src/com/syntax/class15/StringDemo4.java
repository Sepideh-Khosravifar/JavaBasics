package com.syntax.class15;

public class StringDemo4 {

	public static void main(String[] args) {
		
		String name= "111-222-1234";

		//*************Substring Method*****************//
		
		System.out.println(name.substring(8)); //if we want to ignore the 1st 8 numbers of the phone number.
		
		System.out.println(name.substring(8, 11)); //starts counting from the 4th number and ends at the 7th number.
		
		
		
	}

}
