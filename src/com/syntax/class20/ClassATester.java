package com.syntax.class20;

public class ClassATester {
	
	
	public static void main(String args[]) {
		
		ClassA obj = new ClassA(); 
		
		obj.total_sal = obj.salaryA + obj.salaryB + obj.salaryC;
	
		System.out.println("Total Salary is:" + obj.total_sal);

	}  
}
