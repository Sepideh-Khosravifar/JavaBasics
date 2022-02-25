package com.syntax.class1011;

public class Task2 {

	public static void main(String[] args) {
		
		String[] countries = {"Poland", "Germany", "Ukraine", "Russia", "UK"};
		
		String capital = null;
		
		for (int i = 0; i <countries.length; i++) {
		
				
		switch (countries[i]) {
		
		case "Poland":
			capital = "Warsaw";
			break;
			
		case "Germany":
			capital = "Berlin";
			break;
			
		case "Ukraine":
			capital = "Kiev";
			break;
			
		case "Russia":
			capital = "Moscow";
			break;
			
		case "UK":
			capital = "London";
		break;
		
		}
		
		System.out.println("The capital of the countries " + countries[i] + " is " + capital);
			
			
		
		}
		
		

	}

}
