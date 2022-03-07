package com.sysntax.class18;

public class AccessModifiersTesters {



		  private String name = "Naugty Tarik";
		  int age = 50;         //default access
		  protected double weight = 50;
		  public String color = "White";



		    public static void main(String[] args) {
		     AccessModifiers am = new AccessModifiers();
		        //System.out.println(am.name);	//because its PRIVATE, it doesn't work in a est class
		        System.out.println(am.age);
		        System.out.println(am.weight);
		        System.out.println(am.color);



	}

}
