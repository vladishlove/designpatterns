package com.designpatterns.strategy.behaviour.flyable;

public class NormalFlying implements FlyBehaviour {
	@Override
	public String fly() {
		return "I'm up on the sky!";
	}
}
