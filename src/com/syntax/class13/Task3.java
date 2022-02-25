package com.syntax.class13;

public class Task3 {

			String sayHello(String country) {
		
				switch (country) {
				
				case "USA":
				return "Hello";
				
				case "France":
				return "bonjour";
			
				case "Iran":
				return "salam";
					
				default:
				return "I don't know the country";
				
				}
					
			}
				
			
	public static void main(String[] args) {


			Task3 obj = new Task3();    

			String country = obj.sayHello("Iran"); 
			
				System.out.println(country);

			
	}

}
	