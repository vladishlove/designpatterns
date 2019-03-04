package com.designpatterns.abstract_factory;

import com.designpatterns.abstract_factory.domain.Chair;
import com.designpatterns.abstract_factory.domain.Closet;
import com.designpatterns.abstract_factory.domain.Sofa;

public interface AbstractFactory {
	Chair createChair();
	Closet createCloset();
	Sofa createSofa();
}
