package com.designpatterns.visitor.visitor;

import com.designpatterns.visitor.domain.Circle;
import com.designpatterns.visitor.domain.Rectangle;
import com.designpatterns.visitor.domain.Triangle;

public class AreaVisitor implements FigureVisitor {
	@Override
	public void visit(Rectangle rectangle) {
		System.out.print("Rectangle area: ");
		System.out.println(rectangle.getHeight() * rectangle.getHeight());
	}

	@Override
	public void visit(Triangle triangle) {
		// this not actual formula. just to represent pattern
		System.out.print("Triangle area: ");
		System.out.println(triangle.getA() + triangle.getB() + triangle.getC());
	}

	@Override
	public void visit(Circle circle) {
		// this not actual formula. just to represent pattern
		System.out.print("Circle area: ");
		System.out.println(circle.getRadius() * 3.14);
	}
}