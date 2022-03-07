package com.syntax.class19;

//Write a java class that has 4 constructors; with 4 different access 
//levels of constructors(i.e., private, public, default, protected) and create 
//4 objects of this class: 1 - inside same class; 2 - from outside the
//class; 3 - from different class inside different package and observe 
//result.



public class Building {

			
		int age= 10;
		int doors = 2;
		int windows = 5;
		int balcony = 1;
		
		
		public Building()  {
			
					
		}
		
		
		Building(int Buildingage) {
			
			age = Buildingage;
			
		}
		
		

public static void main(String[] args) {
	
}

Building (int Buildingage, int Buildingdoors) {
		
		age = Buildingage;
		doors = Buildingdoors;
			
	}

Building (int Buildingage, int Buildingdoors, int Buildingwindows,int Buildingbalcony) {

	age = Buildingage;
	doors = Buildingdoors;
	windows = Buildingwindows;
	balcony = Buildingbalcony;
	
}
	
	public void printInfo() { System.out.println(age + " " + doors + " " + windows + " " + balcony);}


}

