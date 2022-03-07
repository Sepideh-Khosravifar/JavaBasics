package com.syntax.class20;

public class Lion extends Animal {

		
	boolean huntOthers = true;
	void roar() {
			System.out.println(name + " is roaring color = "
					+ " color" + "\n" + huntOthers);
		}

	public static void main(String[] args) {
	Lion Lion = new Lion();
	Lion.name = "Alex";
	Lion.color = "pink";
	Lion.sleep();
	Lion.roar();
	
	}
	
}








