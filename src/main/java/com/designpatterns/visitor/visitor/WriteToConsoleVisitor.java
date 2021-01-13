package com.designpatterns.visitor.visitor;

import com.designpatterns.visitor.domain.Circle;
import com.designpatterns.visitor.domain.Rectangle;
import com.designpatterns.visitor.domain.Triangle;

public class WriteToConsoleVisitor implements FigureVisitor {
	@Override
	public void visit(Rectangle rectangle) {
		System.out.println("width: " + rectangle.getWidth());
		System.out.println("height: " + rectangle.getHeight());
	}

	@Override
	public void visit(Triangle triangle) {
		System.out.println("tops");
		System.out.println("a: " + triangle.getA());
		System.out.println("b: " + triangle.getB());
		System.out.println("c: " + triangle.getC());
	}

	@Override
	public void visit(Circle circle) {
		System.out.println("radius: " + circle.getRadius());
	}
}
