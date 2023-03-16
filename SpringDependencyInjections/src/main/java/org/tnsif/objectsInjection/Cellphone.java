package org.tnsif.objectsInjection;

public class Cellphone {

	//2. DI in the form of Objects
	 Charger charger;
	 
	//DI Using Setters
	
	 public void setCharger(Charger charger)
	 {
			this.charger = charger;
	}
	public void accept()
	{
		charger.power();
	}


	
	

}
