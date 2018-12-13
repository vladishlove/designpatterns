package com.designpatterns.factorymethod;

import com.designpatterns.factory.PType;
import com.designpatterns.factory.product.Pizza;
import com.designpatterns.factorymethod.product.ny.NYCheese;
import com.designpatterns.factorymethod.product.ny.NYPeperoni;
import com.designpatterns.factorymethod.product.ny.NYSalami;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza cook(PType pType) {
		if (pType.equals(PType.CHEESE)) {
			return new NYCheese();
		} else if (pType.equals(PType.PEPERONI)) {
			return new NYPeperoni();
		} else if (pType.equals(PType.SALAMI)) {
			return new NYSalami();
		} else {
			throw new RuntimeException("unsupported pizza type");
		}
	}
}