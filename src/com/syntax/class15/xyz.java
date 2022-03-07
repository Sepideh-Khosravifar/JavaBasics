package com.syntax.class15;

public class xyz {

	public static void main(String[] args) {
		
		String username="Sisi";
		String password="12345678";
		
		if("Sisi".equals(username) && "1234567".equals(password)) {
			
			System.out.println("Welcome back");
			
		} else {
			
			System.out.println("Usename or password is not correct");
			
		}
			if ("Sisi".equalsIgnoreCase(username) && "12345678".equals(password)) {
			
				System.out.println("Welcome back");
			
			}else { 
			
			System.out.println("Username or password is not correct");
		}

	}
		
	
}
