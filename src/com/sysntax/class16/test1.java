package com.sysntax.class16;
import java.util.Scanner; 

public class test1 {
	
	public static void main(String[] args) {
		
		    
		      Scanner sc = new Scanner(System.in);
		   
		      
		      System.out.println("Enter the browser name to proceed further with execution");
		     
		      String browser = sc.nextLine(); 

		         if (browser.equalsIgnoreCase("cHRomE"))  {
		      System.out.println("Proceed with " + browser + " browser");
		        
		        } else if (browser.equalsIgnoreCase("FireFOX"))  {
		         System.out.println("Proceed with " + browser + " browser");

		        } else if (browser.equalsIgnoreCase("iE")) {
		        
		        System.out.println("Proceed with " + browser + " browser");

		       } else { 

		      System.out.println("Invalid browser");

		        }


		    }
		 
}
		
		
		
		
		
		
		
		
		

	