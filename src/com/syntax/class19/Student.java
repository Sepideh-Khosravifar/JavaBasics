package com.syntax.class19;

//Write a Student class that have instance variables name and address. 
//Create a constructor that will initialize those variables. 
//Print name & address of given student using displayInfo method.


public class Student {
	
	String name = "Jaleh";
	String address = "1760 ABC Drive, Fairfax, VA";
	
     Student() {
    	 
     }
     
     public static void main(String[] args) {
    	 
     }
     
     Student (String Studentname, String Studentaddress) {
    	 
    	 name = Studentname;
    	 address = Studentaddress;
       }
     
    void displayInfo() {System.out.println(name + " " + address); }
}
