package com.designpatterns.visitor.domain;

import com.designpatterns.visitor.visitor.FigureVisitor;

public interface Shape {
	void acceptVisitor(FigureVisitor visitor);
}
