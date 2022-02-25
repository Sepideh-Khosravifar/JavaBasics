package com.syntax.Review;

public class Patterns {

	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) {
						
			System.out.print("*");
		}
		
		System.out.println();
		

		for (int i=1; i<=5; i++) {
			
			
			System.out.println("*");
		}
		
		System.out.println();
		
		for (int i=1; i<=5; i++) {
			
			System.out.print("*");
		}
		
		System.out.println();
			
		for (int i=1; i<=5; i++) {
				
			System.out.println("*");
				
			}
		System.out.println();
		
		
			
			System.out.println("------------better way------------");
			
			for (int r=1; r<=4; r++) {
				for (int col=1; col<=5; col++) {
					
					System.out.print(" * ");
						
				}	
				
				System.out.println();	
									
				}
			
			System.out.println(" 10x10 sqare ");
			
			for (int r=1; r<=10; r++) {
				for (int col=1; col<=10; col++) {
					
					System.out.print(" * ");
			
				}
				
				System.out.println();
				
			}
				
				System.out.println("----------");
				
				for(int a=5; a>=1; a--) {
					
					for (int b=1; b<=5; b++) {
						
						System.out.print(a+" ");
					}
					
					System.out.println();
					
			
		}
	}
}
		



