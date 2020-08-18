package Creational.Abstract_Factory.Products.Apple;

import Creational.Abstract_Factory.Products.Motherboard;

public class AppleMotherBoard implements Motherboard {

	@Override
	public void setParts() {
		System.out.println("Setting " + AppleMotherBoard.class.getName() + " parts");
	}

}