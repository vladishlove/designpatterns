package com.designpatterns.visitor.domain;

import com.designpatterns.visitor.visitor.FigureVisitor;

public class Rectangle implements Shape {
	private int width;
	private int height;

	@Override
	public void acceptVisitor(FigureVisitor visitor) {
		visitor.visit(this);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}