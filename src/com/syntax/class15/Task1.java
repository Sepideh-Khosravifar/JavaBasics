package com.syntax.class15;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        
		              
		        System.out.println("Enter the Username");
		        String uname = sc.nextLine();
		        
		        System.out.println("Enter the Password");
		        String upass = sc.nextLine();
		        
		        		        
		        if((uname.isEmpty()) || (upass.isEmpty())) {
		            System.out.println("Username and Password cannot be empty");
		           		     		        
				} else if (upass.length() < 8) {
		            System.out.println("Password is too short");
		 
		        }
         		        
		       		        	
		        if (upass.contains(uname))  {
		        	System.out.println("Password cannot contain username");
		        	
		       		        
				} else if (upass.equals("confirmedpass"))  {
		        	System.out.println("Your username and password has been created");
		        	
			       		        
				}  else {
		        	
		            System.out.println("Passwords do not match");
		        }

	}
	
}





