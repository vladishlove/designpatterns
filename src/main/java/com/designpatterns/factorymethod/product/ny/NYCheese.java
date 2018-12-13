package com.designpatterns.factorymethod.product.ny;

import com.designpatterns.factory.product.Cheese;

public class NYCheese extends Cheese {
	@Override
	public String getName() {
		return super.getName() + " from NY";
	}
}
