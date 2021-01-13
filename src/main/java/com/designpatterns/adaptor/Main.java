package com.designpatterns.adaptor;

import com.designpatterns.adaptor.domain.Duck;
import com.designpatterns.adaptor.domain.DuckPack;
import com.designpatterns.adaptor.domain.Turkey;

public class Main {
	public static void main(String[] args) {
		Duck duck = new Duck();
		DuckPack duckPack = new DuckPack();

		duckPack.addDuckToPack(duck);
		duckPack.addDuckToPack(new DuckAdapter(new Turkey()));

		duckPack.activatePack();
	}
}
