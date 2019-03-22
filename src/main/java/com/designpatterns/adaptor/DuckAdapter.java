package com.designpatterns.adaptor;

import com.designpatterns.adaptor.domain.Duck;
import com.designpatterns.adaptor.domain.Turkey;

public class DuckAdapter extends Duck {
	private Turkey turkey;
	public DuckAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		this.turkey.gulck();
	}

	@Override
	public void fly() {
		this.turkey.fly();
	}
}
