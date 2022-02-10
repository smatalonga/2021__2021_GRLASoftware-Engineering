package com.uws.week11.structural.clients;

import com.uws.week11.structural.abstracts.Abstraction;
import com.uws.week11.structural.abstracts.NovelAbstraction;
import com.uws.week11.structural.abstracts.RefinedAbstraction;

public class Client {
	public static void main(String[] args) {
		/*
		 * Client chooses to instantiate an Object of Abstraction as a RefinedAbstraction
		 * object to use its implementation. 
		 */
		Abstraction abs = new RefinedAbstraction();
		abs = new NovelAbstraction();
		
		/*
		 * Loading the Implementor class that was chosen to implement the methods of
		 * RefinedAbstraction.
		 */
		abs.loadImplementor();
		
		/*
		 * Invoking the operationImp() method of ConcreteImplementor via the operation()
		 * method of class Abstraction.
		 */
		abs.operation();
	}
}
