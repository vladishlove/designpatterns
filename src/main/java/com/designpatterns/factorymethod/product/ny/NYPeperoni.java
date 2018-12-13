package com.designpatterns.factorymethod.product.ny;

import com.designpatterns.factory.product.Peperoni;

public class NYPeperoni extends Peperoni {
	@Override
	public String getName() {
		return super.getName() + " from NY";
	}
}
