package com.designpatterns.strategy.domain;

import com.designpatterns.strategy.behaviour.flyable.NonFlying;
import com.designpatterns.strategy.behaviour.squawkable.SilentSquawk;

public class WoodenDuck extends AbstractDuck {
	public WoodenDuck() {
		super("I'm wooden", new SilentSquawk(), new NonFlying());
	}
}
