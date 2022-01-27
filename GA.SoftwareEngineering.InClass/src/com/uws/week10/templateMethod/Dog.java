package com.uws.week10.templateMethod;

public class Dog implements Animal {

	@Override
	public boolean isVertebrate() {
		return true;
	}

	@Override
	public String getSpecies() {
		return "Dog";
	}

}
