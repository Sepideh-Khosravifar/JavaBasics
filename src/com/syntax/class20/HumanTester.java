package com.syntax.class20;

public class HumanTester extends Human{

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.name="Jaleh";

		System.out.println(student.name);
		
		student.printName();
		
		student.StudentId="123";
		
		System.out.println("******************");
		
		Principle principle = new Principle();
		
		principle.name="sepideh";
		
		principle.printName();
		
		principle.specialParkingSlot=false;
		
		
	}

}
