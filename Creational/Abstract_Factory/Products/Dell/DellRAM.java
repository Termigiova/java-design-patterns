package Creational.Abstract_Factory.Products.Dell;

import Creational.Abstract_Factory.Products.RAM;

public class DellRAM implements RAM {

	@Override
	public void storeWorkingData() {
		System.out.println("Storing working data on " + DellRAM.class.getName());

	}

}