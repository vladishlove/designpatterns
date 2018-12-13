package com.designpatterns.decorator;

public class Espresso implements Component {
	@Override
	public String getDescription() {
		return "Espresso";
	}

	@Override
	public double getCost() {
		return 0.8;
	}
}
