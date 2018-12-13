package com.designpatterns.factorymethod.product.ny;

import com.designpatterns.factory.product.Salami;

public class NYSalami extends Salami {
	@Override
	public String getName() {
		return super.getName() + " from NY";
	}
}
