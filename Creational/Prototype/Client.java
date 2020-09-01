package Creational.Prototype;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		ArrayList<Shape> shapeArray = new ArrayList<>();

		Circle circle = new Circle(10.0, 20.0, 50.5);
		Shape clonedCircle = circle.clone();

		Rectangle rectangle = new Rectangle(20.0, 30.0, 20.0, 50.0);
		Shape clonedRectangle = rectangle.clone();

		shapeArray.add(circle);
		shapeArray.add(clonedCircle);
		shapeArray.add(rectangle);
		shapeArray.add(clonedRectangle);

		for (Shape shape : shapeArray) {
			shape.printData();
		}

	}

}