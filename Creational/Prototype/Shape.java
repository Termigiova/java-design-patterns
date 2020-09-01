package Creational.Prototype;

public abstract class Shape {

	protected Double position_x;
	protected Double position_y;

	Shape(Shape shape) {
		this.position_x = shape.position_x;
		this.position_y = shape.position_y;
	}

	Shape(Double position_x, Double position_y) {
		this.position_x = position_x;
		this.position_y = position_y;
	}

	abstract void printData();

	protected abstract Shape clone();

}