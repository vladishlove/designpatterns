package com.designpatterns.strategy.behaviour.squawkable;

public class SilentSquawk implements SquawkBehaviour {
	@Override
	public String squawk() {
		return "No noise";
	}
}
