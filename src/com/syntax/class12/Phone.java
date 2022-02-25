package com.syntax.class12;

public class Phone {

	//Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, 
	//Nokia with specific  attributes and behaviors.
		
	String make;
	String model;
	String camera;
	String color;
	
	
	void makeCalls() {
		
		System.out.println(make+ " is ringing");
	}
	
		
	void printCompleteInfo() {
		
		System.out.println("make = " + make);
		System.out.println("model = " + model);
		System.out.println("camera = " + camera);
		System.out.println("color = " + color);
   	 }
	
	public static void main(String[] args) {
		
		Phone iphone= new Phone();
		
		iphone.make="apple";
		iphone.model="iphone 11";
		iphone.camera="one";
		iphone.color= "silver";
		iphone.makeCalls();
		
		iphone.printCompleteInfo();
		
		//*********************************
		
		Phone Android= new Phone();
		
		Android.make="Samsung";
		Android.model=" Samsung Galaxy S22";
		Android.camera="three";
		Android.color= "navy blue";
		
		Android.makeCalls();
		
		Android.printCompleteInfo();
		
		//*********************************
		
		Phone Nokia= new Phone();
				
		Nokia.make="Symbian";
		Nokia.model="Nokia 9 PureView";
		Nokia.camera="two";
		Nokia.color= "dark gray";
				
		Nokia.makeCalls();
				
		Nokia.printCompleteInfo();
		
		
	}

}
