package com.designpatterns.strategy;

import com.designpatterns.strategy.behaviour.flyable.NormalFlying;
import com.designpatterns.strategy.domain.AbstractDuck;
import com.designpatterns.strategy.domain.JustDuck;
import com.designpatterns.strategy.domain.WoodenDuck;

public class Main {
	public static void main(String[] args) {
		AbstractDuck duck1 = new WoodenDuck();
		AbstractDuck duck2 = new JustDuck();
		System.out.println(duck1.fly());

		duck1.setFlyBehaviour(new NormalFlying());
		System.out.println(duck1.fly());
	}
}
