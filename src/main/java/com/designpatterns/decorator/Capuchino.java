package com.designpatterns.decorator;

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
