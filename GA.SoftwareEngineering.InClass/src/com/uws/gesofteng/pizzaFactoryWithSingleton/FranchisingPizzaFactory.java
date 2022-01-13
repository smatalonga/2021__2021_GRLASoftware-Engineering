package com.uws.gesofteng.pizzaFactoryWithSingleton;



public class FranchisingPizzaFactory extends AbstractPizzaFactory {
	public static int royaltyCounter = 0;
	
	private static FranchisingPizzaFactory instance = null; 
	private ConcretePizzaFactory factory;
	
	
	//No one but tis class can access the constructor.
	private FranchisingPizzaFactory() {
		this.factory = new ConcretePizzaFactory();
	}
	
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = this.factory.createPizza(type);
		this.royaltyCounter++;
		
		return pizza;
	}
	
	//Anyone trying to interact with this class, should do so via this method
	public static FranchisingPizzaFactory getInstance() {
		if (FranchisingPizzaFactory.instance == null) {
			FranchisingPizzaFactory.instance = new FranchisingPizzaFactory();
		}
		return FranchisingPizzaFactory.instance;
		
	}
}
