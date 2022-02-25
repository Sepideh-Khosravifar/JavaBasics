package com.syntax.class14;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String name = "       Sisi       ";
		
		System.out.println(name);
		
		System.out.println(name.trim()); // trim will get rid of all extra spaces in the name
				
		String name2 = "Run Sisi";
		
		System.out.println(name2.startsWith("Run")); //"startsWith" returns boolean value
		
		System.out.println(name2.toLowerCase());
		
		System.out.println(name2.toLowerCase().startsWith("run"));
		
		System.out.println(name2.endsWith("i"));
		
		System.out.println(name2.contains("w"));
		
		
	}
	
}
