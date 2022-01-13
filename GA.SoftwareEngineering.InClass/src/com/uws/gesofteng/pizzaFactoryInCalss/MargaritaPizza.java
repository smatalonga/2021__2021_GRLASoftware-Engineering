package com.uws.gesofteng.pizzaFactoryInCalss;

public class MargaritaPizza extends Pizza {

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "MargaritaPizza";
	}
	
	public void bake() {
		
		this.setOven(120);
	}

}
