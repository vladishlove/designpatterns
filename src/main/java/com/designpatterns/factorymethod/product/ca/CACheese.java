package com.designpatterns.factorymethod.product.ca;

import com.designpatterns.factory.product.Cheese;

public class CACheese extends Cheese {
	@Override
	public String getName() {
		return super.getName() + " from CA";
	}
}
