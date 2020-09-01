package Creational.Prototype;

public class Circle extends Shape {

	private Double radius;

	Circle(Double position_x, Double position_y, Double radius) {
		super(position_x, position_y);
		this.radius = radius;
	}

	Circle(Circle circle) {
		super(circle);
		this.radius = circle.radius;
	}

	@Override
	protected Shape clone() {
		return new Circle(this);
	}

	public void printData() {
		System.out.println("–––––––Circle data–––––––");
		System.out.println("Radius: " + radius);
		System.out.println("Position X: " + position_x);
		System.out.println("Position Y: " + position_y);
	}

}