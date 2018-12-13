package com.designpatterns.factorymethod;

import com.designpatterns.factory.PType;
import com.designpatterns.factory.product.Pizza;
import com.designpatterns.factorymethod.product.ca.CACheese;
import com.designpatterns.factorymethod.product.ca.CAPeperoni;
import com.designpatterns.factorymethod.product.ca.CASalami;

public class CAPizzaStore extends PizzaStore {

	@Override
	public Pizza cook(PType pType) {
		if (pType.equals(PType.CHEESE)) {
			return new CACheese();
		} else if (pType.equals(PType.PEPERONI)) {
			return new CAPeperoni();
		} else if (pType.equals(PType.SALAMI)) {
			return new CASalami();
		} else {
			throw new RuntimeException("unsupported pizza type");
		}
	}
}