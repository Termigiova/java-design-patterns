package Creational.Prototype;

public class Rectangle extends Shape {

	private Double width;
	private Double height;

	Rectangle(Double position_x, Double position_y, Double width, Double height) {
		super(position_x, position_y);
		this.width = width;
		this.height = height;
	}

	Rectangle(Rectangle rectangle) {
		super(rectangle);
		this.width = rectangle.width;
		this.height = rectangle.height;
	}

	@Override
	protected Shape clone() {
		return new Rectangle(this);
	}

	public void printData() {
		System.out.println("–––––––Rectangle data–––––––");
		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
		System.out.println("Position X: " + position_x);
		System.out.println("Position Y: " + position_y);
	}

}