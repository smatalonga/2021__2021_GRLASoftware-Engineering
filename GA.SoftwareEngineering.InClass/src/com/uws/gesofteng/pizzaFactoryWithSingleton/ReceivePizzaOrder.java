package com.uws.gesofteng.pizzaFactoryWithSingleton;

public class ReceivePizzaOrder {
	
	private AbstractPizzaFactory myPizzaFactory;
	
	public ReceivePizzaOrder() {
		this.myPizzaFactory = new ConcretePizzaFactory();
		
	}
	
	public ReceivePizzaOrder(AbstractPizzaFactory factory) {
		this.myPizzaFactory = factory;
		
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
