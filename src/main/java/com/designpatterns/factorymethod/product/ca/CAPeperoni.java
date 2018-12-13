package com.designpatterns.factorymethod.product.ca;

import com.designpatterns.factory.product.Peperoni;

public class CAPeperoni extends Peperoni {
	@Override
	public String getName() {
		return super.getName() + " from CA";
	}
}
