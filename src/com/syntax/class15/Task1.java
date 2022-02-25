package com.syntax.class15;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        
		              
		        System.out.println("Enter the Username");
		        String uname = sc.nextLine();
		        
		        System.out.println("Enter the Password");
		        String upass = sc.nextLine();
		        
		        		        
		        if((uname.equals(" ")) || (upass.equals(" "))) {
		            System.out.println("Username and Password cannot be empty");
		            return;
		        }

		        
		        if(upass.length() < 8) {
		            System.out.println("Password is too short");
		            return;
		        }

		      
		        System.out.println("Re-enter your Password");
		        
		        String lpass = sc.nextLine();
		        		        
		       		        	
		        if (upass.contains(uname)) {
		        	System.out.println("Password cannot contain username");
		        	return;
		        }
		        
		        if(upass.equals("lpass")) {
		        	System.out.println("password cannot contain username");
		        	return;
			        }
		        
		        else {
		        	
		            System.out.println("Your username and password has been created");
		        }
		  
	}
	
}





