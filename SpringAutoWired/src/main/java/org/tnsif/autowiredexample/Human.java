package org.tnsif.autowiredexample;

public class Human {

	//DI in the form of objects
	Oxygen o;

	//DI using setters
	public void setO(Oxygen o) {
		this.o = o;
	}
	
	//injecting the object of oxygen
	public void display() {
		o.show();
	}

	//DI using constructor
	public Human(Oxygen o) {
		super();
		this.o = o;
	}
	
}
