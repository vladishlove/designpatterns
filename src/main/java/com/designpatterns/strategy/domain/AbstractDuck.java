package com.designpatterns.strategy.domain;

import com.designpatterns.strategy.behaviour.flyable.FlyBehaviour;
import com.designpatterns.strategy.behaviour.squawkable.SquawkBehaviour;

public class AbstractDuck {
	private String name;
	private SquawkBehaviour squawkBehaviour;
	private FlyBehaviour flyBehaviour;

	public AbstractDuck() {
	}

	public AbstractDuck(String name, SquawkBehaviour squawkBehaviour, FlyBehaviour flyBehaviour) {
		this.name = name;
		this.squawkBehaviour = squawkBehaviour;
		this.flyBehaviour = flyBehaviour;
	}

	public String squawk() {
		return squawkBehaviour.squawk();
	}

	public String fly() {
		return flyBehaviour.fly();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SquawkBehaviour getSquawkBehaviour() {
		return squawkBehaviour;
	}

	public void setSquawkBehaviour(SquawkBehaviour squawkBehaviour) {
		this.squawkBehaviour = squawkBehaviour;
	}

	public FlyBehaviour getFlyBehaviour() {
		return flyBehaviour;
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
}
