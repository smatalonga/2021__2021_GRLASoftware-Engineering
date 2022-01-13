package com.uws.gesofteng.pizzaFactoryInCalss;

public class ConcretePizzaFactory extends AbstractPizzaFactory {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if (type.equals("Margarita")) {
			pizza = new MargaritaPizza();
		} else if (type.equals("Hawaian")) {
			pizza = new HawaianPizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}
		else if (type.equals("Vegan")){
			pizza = new VeganPizza();
		}
		
		return pizza;
	}

}
