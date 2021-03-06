package com.patterns.p03.factory.simple;

import com.patterns.p03.factory.shape.*;

public class SimpleShapeFactory {
	public Shape getShape(ShapeType type) {
		Shape shape = null;
		switch (type) {
			case CIRCLE:
				shape = new Circle();
				break;
			case SQUARE:
				shape = new Square();
				break;
			case TRIANGLE:
				shape = new Triangle();
				break;
		}
		return shape;
	}
}
