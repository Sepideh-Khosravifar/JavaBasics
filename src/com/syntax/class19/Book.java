package com.syntax.class19;

//Write Book class that will have instance variables and 2 Constructors. 
//While creating an object make sure: Instance variables are being initialized
//Both Constructors are being executed.


public class Book {

		String title = "No Boundry";
		String author = "Wilber";
		double price = 16.95;
		
		
		Book() {
			
			
			
		}
		
		
public static void main(String[] args) {
		
}
		
		
		
	Book (String Booktitle, String Bookauthor, double Bookprice) {
		
		title = Booktitle;
		author = Bookauthor;
		price = Bookprice;
		
	}
		
		void printinfo() {System.out.println(title + " " +author + " " + price );}
		
}