package com.designpatterns.visitor.domain;

import com.designpatterns.visitor.visitor.FigureVisitor;

public class Triangle implements Shape {
	private int a;
	private int b;
	private int c;
	@Override
	public void acceptVisitor(FigureVisitor visitor) {
		visitor.visit(this);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
}
