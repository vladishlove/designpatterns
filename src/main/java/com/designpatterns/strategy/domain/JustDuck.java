package com.designpatterns.strategy.domain;

import com.designpatterns.strategy.behaviour.squawkable.CommonSquawk;
import com.designpatterns.strategy.behaviour.flyable.NormalFlying;

public class JustDuck extends AbstractDuck {
	public JustDuck() {
		super("I'm normal", new CommonSquawk(), new NormalFlying());
	}
}
