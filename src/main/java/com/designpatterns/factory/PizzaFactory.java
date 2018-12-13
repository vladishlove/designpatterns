package com.designpatterns.factory;

import com.designpatterns.factory.product.Cheese;
import com.designpatterns.factory.product.Peperoni;
import com.designpatterns.factory.product.Pizza;
import com.designpatterns.factory.product.Salami;

public class PizzaFactory {
	public Pizza createPizza(PType pType) {
		if (pType == null) {
			return null;
		}

		if (pType.equals(PType.CHEESE)) {
			return new Cheese();
		} else if (pType.equals(PType.PEPERONI)) {
			return new Peperoni();
		} else if (pType.equals(PType.SALAMI)) {
			return new Salami();
		} else {
			throw new RuntimeException("unsupported pizza type");
		}
	}
}
