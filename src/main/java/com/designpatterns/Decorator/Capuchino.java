package com.designpatterns.Decorator;

public class Capuchino implements Component {
	@Override
	public String getDescription() {
		return "Capuchino";
	}

	@Override
	public double getCost() {
		return 1.2;
	}
}
