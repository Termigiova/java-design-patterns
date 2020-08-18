package Creational.Abstract_Factory.Products.Apple;

import Creational.Abstract_Factory.Products.Processor;

public class AppleProcessor implements Processor {

	@Override
	public void processTasks() {
		System.out.println("Processing tasks on " + AppleProcessor.class.getName());

	}

}