package com.designpatterns.Decorator;

public class Milk extends ComponentDecorator {
	public Milk(Component component) {
		super(component);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "milk";
	}

	@Override
	public double getCost() {
		return super.getCost() + 0.2;
	}
}
