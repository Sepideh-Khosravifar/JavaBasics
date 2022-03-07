package com.syntax.Review;

public class World {

	public static void main(String[] args) {
		
		Human human1 = new Human();
		human1.name="John";
		human1.lastName="Doe";
		human1.eyeColor="blue";
		human1.gender = 'F';
		human1.age=33;
		
		System.out.println(human1.name);
		
		
		//human1.hands=2; beacause hands was not defined in the Human class
		human1.sleep();
		human1.run();
		human1.eat();
		
		//human1.tired(); was not defined in the Human class
	}

}
