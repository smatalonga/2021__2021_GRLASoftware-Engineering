package com.uws.gesofteng.pizzaFactoryWithSingleton;

public class HawaianPizza extends Pizza {

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "HawaianPizza";
	}
	
	public void bake() {
		
		this.setOven(190);
	}
}
