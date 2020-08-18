package Creational.Abstract_Factory.Products.Dell;

import Creational.Abstract_Factory.Products.Motherboard;

public class DellMotherBoard implements Motherboard {

	@Override
	public void setParts() {
		System.out.println("Setting " + DellMotherBoard.class.getName() + " parts");
	}

}