package com.sysntax.class18;

public class Task2 {

		
	public static String reverseString(String input) {	
		
		StringBuilder stringBuilder = new StringBuilder (input);
		
		stringBuilder.reverse();
		
		return stringBuilder.toString();
		
		//or use below code string chaining
		
		//return new StringBuilder(input).reverse().toString();
		//new StringBuilder(input) is object creation
		//new StringBuilder(input).reverse() calling a reverse method on that object
		//return new StringBuilder(input).reverse().toString() calling two methods on that object
		
		
		
	}		
		
	public static void main(String[] args) {
		
		String name = "Emili";
		
		System.out.println(Task2.reverseString(name));
		
	}
		}
	


