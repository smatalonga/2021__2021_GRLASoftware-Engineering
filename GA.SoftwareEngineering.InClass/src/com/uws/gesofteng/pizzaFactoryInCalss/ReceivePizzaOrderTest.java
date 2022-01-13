package com.uws.gesofteng.pizzaFactoryInCalss;

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

}
