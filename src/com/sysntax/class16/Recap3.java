package com.sysntax.class16;

public class Recap3 {

	public static void main(String[] args) {
	
		String str = "12345610!#%#gjgdshfhdsfhHAkHSKDHFJSAF";
		
		System.out.println(str.replaceAll ("[0-9]", "#"));
		System.out.println(str.replaceAll ("[0-9]", ""));
		
		System.out.println(str.replaceAll ("[10]", "#"));
		System.out.println(str.replaceAll ("[a-z]", ""));
		System.out.println(str.replaceAll ("[A-Z]", ""));
		System.out.println(str.replaceAll ("[!-/]", ""));
		System.out.println(str.replaceAll ("[A-Za-z0-9]", ""));
		System.out.println(str.replaceAll ("[^A-Za-z0-9]", ""));
		
	}
	
}
