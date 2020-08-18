package Creational.Abstract_Factory.Products.Dell;

import Creational.Abstract_Factory.Products.PowerSource;

public class DellPowerSource implements PowerSource {

	@Override
	public void provideEnergy() {
		System.out.println("Providing energy from " + DellPowerSource.class.getName());
	}

}