package com.uws.gesofteng.pizzaFactoryWithSingleton;

public class PepperoniPizza extends Pizza {

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "PepperoniPizza";
	}
	
	public void bake() {
		
		this.setOven(200);
	}

}
