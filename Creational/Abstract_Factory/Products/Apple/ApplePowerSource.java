package Creational.Abstract_Factory.Products.Apple;

import Creational.Abstract_Factory.Products.PowerSource;

public class ApplePowerSource implements PowerSource {

	@Override
	public void provideEnergy() {
		System.out.println("Providing energy from " + ApplePowerSource.class.getName());
	}

}