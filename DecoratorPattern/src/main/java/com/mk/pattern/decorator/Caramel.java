package com.mk.pattern.decorator;

import com.mk.pattern.component.Beverage;

public class Caramel extends AdOnDecorator{
	
	Beverage beverage;

	@Override
	public String getDescription() {
		return beverage.getDescription() + " and " + "Caramel";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + 1.2;
	}
	
	public Caramel(Beverage b) {
		this.beverage = b;
	}
	

}
