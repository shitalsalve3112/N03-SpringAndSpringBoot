package org.tnsif.Literals;

public class SwiftEngine implements IEngine{
	
    //DI in the form of Literals
	private  String company;
	private  double cost;
	public double cost() {
		
		return cost;
	}
	public String display() {
		
		return "India";
	}
	//Getters and Setters
	
	public void setCompany(String company) {
		this.company = company;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	//Two String Method
	@Override
	public String toString() {
		return "origin of company:"+company+ fuel;
	}
	
	
}
