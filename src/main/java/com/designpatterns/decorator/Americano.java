package com.designpatterns.decorator;

public class Americano implements Component {
	@Override
	public String getDescription() {
		return "Americano";
	}

	@Override
	public double getCost() {
		return 1.0;
	}
}
