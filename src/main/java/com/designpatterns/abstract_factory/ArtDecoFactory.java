package com.designpatterns.abstract_factory;

import com.designpatterns.abstract_factory.domain.ArtDecoChair;
import com.designpatterns.abstract_factory.domain.ArtDecoCloset;
import com.designpatterns.abstract_factory.domain.ArtDecoSofa;

public class ArtDecoFactory implements AbstractFactory {
	@Override
	public ArtDecoChair createChair() {
		return new ArtDecoChair();
	}

	@Override
	public ArtDecoCloset createCloset() {
		return new ArtDecoCloset();
	}

	@Override
	public ArtDecoSofa createSofa() {
		return new ArtDecoSofa();
	}
}
