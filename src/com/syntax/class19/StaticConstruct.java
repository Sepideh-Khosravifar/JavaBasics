package com.syntax.class19;

//Write program that have static constructor and observe result.


public class StaticConstruct {


		public static StaticConstruct() {
		    
		         System.out.println("Static Constructor");
		     }
		     
		public static void main(String args[]) {
		     
		        
		         StaticConstruct obj = new StaticConstruct();
		     }
		}	
		
		
	//static means only ONE copy so there is no point to use it with constructor	
