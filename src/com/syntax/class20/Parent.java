package com.syntax.class20;

public class Parent {

	//public static void main(String[] args) {
		 
		private String name; //private members do not participate in inheritance
		int age;
		protected double weight;
		public String color;

	}

class Child extends Parent {
	
	void printinfo() {
		System.out.println(age);
		System.out.println(weight);
		System.out.println(color);
		
	}
}
