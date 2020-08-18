package Creational.Abstract_Factory.Products.Dell;

import Creational.Abstract_Factory.Products.Processor;

public class DellProcessor implements Processor {

	@Override
	public void processTasks() {
		System.out.println("Processing tasks on " + DellProcessor.class.getName());

	}

}