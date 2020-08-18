package Creational.Abstract_Factory.Products.Apple;

import Creational.Abstract_Factory.Products.Case;

public class AppleCase implements Case {

	@Override
	public void open() {
		System.out.println("Opening" + AppleCase.class.getName());
	}

	@Override
	public void close() {
		System.out.println("Closing" + AppleCase.class.getName());
	}

}