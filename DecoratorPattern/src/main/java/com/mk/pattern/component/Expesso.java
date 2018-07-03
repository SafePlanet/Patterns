package com.mk.pattern.component;

public class Expesso extends Beverage{

	@Override
	public String getDescription() {
		return "Expesso";
	}

	@Override
	public double cost() {
		return 1;
	}

}
