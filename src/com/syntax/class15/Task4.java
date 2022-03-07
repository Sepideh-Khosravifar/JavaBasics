package com.syntax.class15;

public class Task4 {

	public static void main(String[] args) {
		
		String name = "How camelyou camelyou camel)";
		
		System.out.println(name.indexOf("camel"));
		
		System.out.println(name.lastIndexOf("horse")); // we get '-1' because this word is not in our defined string.
		
		System.out.println(name.lastIndexOf("%")); // we get '-1' because this symbol is not in our defined string.
		
		System.out.println(name.lastIndexOf("camel", 23)); // we are looking for the third camel in the String.	
		
		
		
	}

}
