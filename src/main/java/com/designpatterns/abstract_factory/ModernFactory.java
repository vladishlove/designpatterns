package com.designpatterns.abstract_factory;

import com.designpatterns.abstract_factory.domain.ModernChair;
import com.designpatterns.abstract_factory.domain.ModernCloset;
import com.designpatterns.abstract_factory.domain.ModernSofa;

public class ModernFactory implements AbstractFactory {
	@Override
	public ModernChair createChair() {
		return new ModernChair();
	}

	@Override
	public ModernCloset createCloset() {
		return new ModernCloset();
	}

	@Override
	public ModernSofa createSofa() {
		return new ModernSofa();
	}
}
