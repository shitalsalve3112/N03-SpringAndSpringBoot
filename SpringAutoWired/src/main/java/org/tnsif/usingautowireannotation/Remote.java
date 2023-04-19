package org.tnsif.usingautowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Remote {

	//DI in the form of objects
	private Cell cell;

	//DI using setters
	//to achieve autowiring using setters, use @Autowired annotation
	@Autowired
	//when you have created multiple bean then if u want to access particular one then @Qalifier annotation
	@Qualifier("c1")
	public void setCell(Cell cell) {
		this.cell = cell;
	}

	//default constructor
	public Remote() {
		System.out.println("Default constructor for remote");
	}
	
	//injecting the object of cell class
	public void remote() {
		cell.power();
	}
	
}
