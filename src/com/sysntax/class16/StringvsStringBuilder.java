package com.sysntax.class16;

public class StringvsStringBuilder {

	public static void main(String[] args) {
		
		String s = new String("Asghar Is Great");//original string
		
		s.concat("hahah");//add new string hahha to the string
		
		//System.out.println(s.replace(" ", ""));
		
		System.out.println(s); //printing out the original string
		
		
		StringBuilder stringBuilder = new StringBuilder("Asghar Is Great");//original string
		
		stringBuilder.append("Hahaha"); //add new String hahha to the string
		
		System.out.println(stringBuilder.reverse()); // add new String hahha to the string
		
		System.out.println(stringBuilder); //printing out the original string
		
		//String str="";
		
		//for (int i=0; 0<1000; i++) {
		//	str.append(i);
			
		//}
		
		//System.out.println();
		
		
		
		
		
		
		
		
	}

}
