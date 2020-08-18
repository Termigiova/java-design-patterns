package Creational.Abstract_Factory.Products.Apple;

import Creational.Abstract_Factory.Products.VideoCard;

public class AppleVideoCard implements VideoCard {

	@Override
	public void processGraphics() {
		System.out.println("Processing graphics on " + AppleVideoCard.class.getName());

	}

}