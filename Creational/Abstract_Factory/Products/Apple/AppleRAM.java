package Creational.Abstract_Factory.Products.Apple;

import Creational.Abstract_Factory.Products.RAM;

public class AppleRAM implements RAM {

	@Override
	public void storeWorkingData() {
		System.out.println("Storing working data on " + AppleRAM.class.getName());

	}

}