package com.designpatterns.visitor.domain;

import com.designpatterns.visitor.visitor.FigureVisitor;

public class Circle implements Shape {
	private int radius;

	@Override
	public void acceptVisitor(FigureVisitor visitor) {
		visitor.visit(this);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}