package Creational.Abstract_Factory.Products.Dell;

import Creational.Abstract_Factory.Products.Case;

public class DellCase implements Case {

	@Override
	public void open() {
		System.out.println("Opening" + DellCase.class.getName());
	}

	@Override
	public void close() {
		System.out.println("Closing" + DellCase.class.getName());
	}

}