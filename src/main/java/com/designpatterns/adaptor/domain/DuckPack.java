package com.designpatterns.adaptor.domain;

import java.util.ArrayList;
import java.util.List;

public class DuckPack {
	private List<Duck> ducks = new ArrayList<>();

	public void addDuckToPack(Duck duck) {
		ducks.add(duck);
	}

	public void activatePack() {
		for (Duck duck : ducks) {
			duck.quack();
			duck.quack();
			duck.fly();
		}
	}
}
