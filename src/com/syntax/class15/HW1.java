package com.syntax.class15;

public class HW1 {

	public static void main(String[] args) {
		
		//Write a program that reads two people's first
		//names and if they expecting boy or girl? 
		//Based on the input suggests a name for a baby:
		//Example Output:
		//Mom’s first name? Mary
		//Dad’s first name? Daniel
		//Boy or Girl? boy
		//Suggested baby name: DANRY
		//Example Output:
		//Mom’s first name? Mary
		//Dad’s first name? Daniel
		//Boy or Girl? girl
		//Suggested baby name: MAIEL
		
	
		String mother = "MARY";
		String father = "DANIEL";
		String expectation = "boy";
		String firstPart = "";
		String secondPart= "";
		
		
		if(expectation.equalsIgnoreCase("boy")) {
		
			firstPart=father.substring(0, father.length()/2);    //we have "Daniel" and we are trying to use the first 3 letters from his name for the baby boy's name
			
			secondPart=mother.substring(mother.length()/2);		//we have "Mary" and we are trying to use the last 2 letters from her name for the baby girl's name
			
		} else if (expectation.equalsIgnoreCase("girl")) {
			
			firstPart=mother.substring(0, mother.length()/2);    //we have "Mary" and we are trying to use the first 2 letters from her name for the baby girl's name
			
			secondPart=father.substring(father.length()/2);		//we have "Daniel" and we are trying to use the last 3 letters from his name for the baby girl's 
		}	
			
			System.out.println(firstPart + secondPart);	
			
			
			}
		}