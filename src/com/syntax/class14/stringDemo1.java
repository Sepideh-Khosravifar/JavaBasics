package com.syntax.class14;

public class stringDemo1 {

	public static void main(String[] args) {
		
		String name = "Sepideh"; //always use this format
	
		String name2 = new String ("SEPIDEH in all uppercase   "); //Do not use this format
		
		System.out.println(name);
		
		System.out.println(name2); 
		
		System.out.println(name.length()); // counts the no. of the letters in the name
		
		System.out.println(name2.length()); //note that spaces are counted as characters
		
		String newName = name2.toLowerCase();
		
		System.out.println(name2.toLowerCase());
		
		System.out.println(name2.toUpperCase());
		
		System.out.println(name + name2);    //preferable method for concatenation
		
		System.out.println(name.concat(name2));
		
		System.out.println(name.isEmpty()); //isEmpty returns a boolean value depending on the name 
				 
	}

}
