package com.designpatterns.visitor;

import com.designpatterns.visitor.domain.Circle;
import com.designpatterns.visitor.domain.Rectangle;
import com.designpatterns.visitor.domain.Triangle;
import com.designpatterns.visitor.visitor.AreaVisitor;
import com.designpatterns.visitor.visitor.WriteToConsoleVisitor;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();

		circle.setRadius(10);
		rectangle.setHeight(10);
		rectangle.setWidth(12);
		triangle.setA(4);
		triangle.setB(6);
		triangle.setC(7);

		System.out.println("Circle");
		circle.acceptVisitor(new AreaVisitor());
		circle.acceptVisitor(new WriteToConsoleVisitor());

		System.out.println("Rectangle");
		rectangle.acceptVisitor(new AreaVisitor());
		rectangle.acceptVisitor(new WriteToConsoleVisitor());

		System.out.println("Triangle");
		triangle.acceptVisitor(new AreaVisitor());
		triangle.acceptVisitor(new WriteToConsoleVisitor());

	}
}
