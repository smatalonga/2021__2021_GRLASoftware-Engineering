package com.uws.week11.structural.abstracts;

import com.uws.week11.structural.implementors.Implementor;

/*
 * Various participants in this sample code are Abstraction, RefinedAbstraction,
 * Implementor, ConcreteImp and Client class. Abstraction defines the abstraction's
 * interface. RefinedAbstraction extends the interface provided by Abstraction.
 * Implementor defines the interface for Implementor class and  ConcreteImp
 * implements that.
 */
public abstract class Abstraction {
	protected Implementor imp;
	
	//The operation of the abstract class is implemented in the Implementor class. 
	public void operation() {
		imp.operationImp();
	}
	
	//Implementation is provided by child class. The subclasses of Abstraction can
	//choose which subclass of Implementor to instantiate. 
	public abstract Implementor loadImplementor(); 
}
