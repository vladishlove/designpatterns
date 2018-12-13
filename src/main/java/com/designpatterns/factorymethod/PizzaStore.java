package com.designpatterns.factorymethod;

import com.designpatterns.factory.PType;
import com.designpatterns.factory.Region;
import com.designpatterns.factory.product.Pizza;

public abstract class PizzaStore {
	public Pizza orderPizza(PType pType) {
		System.out.println("start cooking");
		Pizza pizza = cook(pType);
		slice();
		pack();

		return pizza;
	}

	private void slice() {
		System.out.println("I'me slicing");
	}
	private void pack() {
		System.out.println("packing");
	}

	// factory method. implementation is up to subclasses of PizzaStore
	protected abstract Pizza cook(PType pType);
}
