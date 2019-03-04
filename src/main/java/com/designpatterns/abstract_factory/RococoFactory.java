package com.designpatterns.abstract_factory;

import com.designpatterns.abstract_factory.domain.RococoChair;
import com.designpatterns.abstract_factory.domain.RococoCloset;
import com.designpatterns.abstract_factory.domain.RococoSofa;

public class RococoFactory implements AbstractFactory {
	@Override
	public RococoChair createChair() {
		return new RococoChair();
	}

	@Override
	public RococoCloset createCloset() {
		return new RococoCloset();
	}

	@Override
	public RococoSofa createSofa() {
		return new RococoSofa();
	}
}
