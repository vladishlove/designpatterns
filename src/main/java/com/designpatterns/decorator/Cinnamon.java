package com.designpatterns.decorator;

public class Cinnamon extends ComponentDecorator {
	public Cinnamon(Component component) {
		super(component);
	}

	@Override
	public double getCost() {
		return super.getCost() + 0.1;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "cinnamon";
	}
}
