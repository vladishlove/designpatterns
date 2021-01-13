package com.designpatterns.visitor.visitor;

import com.designpatterns.visitor.domain.Circle;
import com.designpatterns.visitor.domain.Rectangle;
import com.designpatterns.visitor.domain.Triangle;

public interface FigureVisitor {
	void visit(Rectangle rectangle);
	void visit(Triangle triangle);
	void visit(Circle circle);
}
