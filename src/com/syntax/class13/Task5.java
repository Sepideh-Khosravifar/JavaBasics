package com.syntax.class13;

public class Task5 {

	
		// Write a method to return whether given number is Prime or not
		
		
		boolean isPrime(int number) {
		
			boolean isPrime = true;
			
			if (number > 1) {
			
				for (int i = 2; i <= number; i++) {
			
					if (number % i == 0) {
											
						isPrime=false;
						
						break;
						
					}
				}
								
				
					} else { 
			  
						isPrime=true; 			  		
					}	
				
			return isPrime;
			
		}
		
			public static void main(String[] args) {


				Task5 obj = new Task5();    

				
				System.out.println(obj.isPrime(1));
				
		}
					
	}

	

		
			
			