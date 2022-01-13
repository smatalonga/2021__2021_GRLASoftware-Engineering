package com.uws.gesofteng.pizzaFactoryWithSingleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReceivePizzaOrderTest {

	@Test
	void testCreateMargarita() {
		ReceivePizzaOrder rp = new ReceivePizzaOrder();
		
		Pizza p = rp.orderPizza("Margarita");
		
		assertEquals("MargaritaPizza", p.getType());
	}
	
	@Test
	void testCreateHawaian() {
		ReceivePizzaOrder rp = new ReceivePizzaOrder();
		
		Pizza p = rp.orderPizza("Hawaian");
		
		assertEquals("HawaianPizza", p.getType());
	}
	
	@Test
	void testCreateHawaianWithFranchising() {
		
		assertNotNull(FranchisingPizzaFactory.getInstance());
		
		AbstractPizzaFactory factoryToUse = FranchisingPizzaFactory.getInstance();
		
		ReceivePizzaOrder rp = new ReceivePizzaOrder(factoryToUse);
		
		Pizza p = rp.orderPizza("Hawaian");
		
		assertEquals("HawaianPizza", p.getType());
		
		assertNotNull(FranchisingPizzaFactory.getInstance());
		
	}

}
