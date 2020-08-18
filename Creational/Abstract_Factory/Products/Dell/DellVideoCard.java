package Creational.Abstract_Factory.Products.Dell;

import Creational.Abstract_Factory.Products.VideoCard;

public class DellVideoCard implements VideoCard {

	@Override
	public void processGraphics() {
		System.out.println("Processing graphics on " + DellVideoCard.class.getName());
	}

}