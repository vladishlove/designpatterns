package com.designpatterns.factorymethod.product.ca;

import com.designpatterns.factory.product.Salami;

public class CASalami extends Salami {
	@Override
	public String getName() {
		return super.getName() + " from CA";
	}
}
