package com.uws.gesofteng.pizzaFactoryInCalss;



public class FranchisingPizzaFactory extends AbstractPizzaFactory {
	public static int royaltyCounter = 0;
	
	private ConcretePizzaFactory factory;
	
	public FranchisingPizzaFactory() {
		this.factory = new ConcretePizzaFactory();
	}
	
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = this.factory.createPizza(type);
		royaltyCounter++;
		
		return pizza;
	}
}
