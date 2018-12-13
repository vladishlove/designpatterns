package com.designpatterns.decorator;

public class ComponentDecorator implements Component {
	private Component component;

	public ComponentDecorator(Component component) {
		this.component = component;
	}

	@Override
	public String getDescription() {
		return component.getDescription() + " with ";
	}

	@Override
	public double getCost() {
		return component.getCost();
	}
}
