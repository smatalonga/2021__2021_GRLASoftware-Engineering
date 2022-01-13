package com.uws.gesofteng.pizzaFactoryInCalss;

public class ReceivePizzaOrder {
	
	private AbstractPizzaFactory myPizzaFactory;
	
	public ReceivePizzaOrder() {
		this.myPizzaFactory = new ConcretePizzaFactory();
		
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza = this.myPizzaFactory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
