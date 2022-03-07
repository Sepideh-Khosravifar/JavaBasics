package com.sysntax.class16;

public class stringTask4 {
	
	public static void main(String[] args) {

		// How would you reverse a String word by word? for example
		// input=>This is sentence i want to reverse
		// output=>sihT si ecnetnes i tnaw ot esrever
	
	
		StringBuilder stringBuilder = new StringBuilder("Weekend");//original string
		
		System.out.println(stringBuilder.reverse()); 
		
    //*********************another way**************************//
		
		String s = "Sunday";
		StringBuilder str = new StringBuilder(s);
		str.reverse();
		s= str.toString();
		System.out.println(s);
		
	//***********************reverse differently**************//
		
		String newStr = "";
		
		String s2=stringBuilder.toString();
		
		String[] strArr = s2.split(" ");
		
		
	}
	
}
