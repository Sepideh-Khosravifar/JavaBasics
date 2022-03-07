package com.syntax.class17;

public class Students {

		
		    String Name;
		    String ID;
		    static int numberOfStudents;

		    public static void main(String[] args) {

		        Students Object1 = new Students();
		        Object1.Name = "Sepideh";
		        Object1.ID = "749";
		        Students.numberOfStudents++;
		        

		        Students Object2 = new Students();
		        Object2.Name = "LouAnn";
		        Object2.ID = "925";
		        Students.numberOfStudents++;
		        

		        Students Object3 = new Students();
		        Object3.Name = "Lily";
		        Object3.ID = "444";
		        Students.numberOfStudents++;
		        
		        System.out.println(Students.numberOfStudents);
		   
		
		
		
	}

}
