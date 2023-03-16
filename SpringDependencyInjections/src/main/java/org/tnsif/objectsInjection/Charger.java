package org.tnsif.objectsInjection;

public class Charger {
	
    //Private Data Members
	private String brand;
	private int voltage;
	private String type;
	
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void power() {
		
		System.out.println("Brand:"+brand+" "+"Voltage="+voltage+" "+"Charger-type:"+type+" ");
	}
	//Two String
	@Override
	public String toString() {
		return "Charger [Brand=" + brand + ", voltage=" + voltage + ", type=" + type + "]";
	}
	
	
	
	

	
}
