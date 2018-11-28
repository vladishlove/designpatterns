package com.designpatterns.strategy.behaviour.flyable;

public class NonFlying implements FlyBehaviour {
	@Override
	public String fly() {
		return "Sorry, I can't fly";
	}
}
