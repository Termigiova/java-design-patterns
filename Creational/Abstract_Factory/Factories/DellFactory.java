package Creational.Abstract_Factory.Factories;

import Creational.Abstract_Factory.Products.Case;
import Creational.Abstract_Factory.Products.Motherboard;
import Creational.Abstract_Factory.Products.PowerSource;
import Creational.Abstract_Factory.Products.Processor;
import Creational.Abstract_Factory.Products.RAM;
import Creational.Abstract_Factory.Products.VideoCard;
import Creational.Abstract_Factory.Products.Dell.DellCase;
import Creational.Abstract_Factory.Products.Dell.DellMotherBoard;
import Creational.Abstract_Factory.Products.Dell.DellPowerSource;
import Creational.Abstract_Factory.Products.Dell.DellProcessor;
import Creational.Abstract_Factory.Products.Dell.DellRAM;
import Creational.Abstract_Factory.Products.Dell.DellVideoCard;

public class DellFactory implements PCFactory {

	@Override
	public Case createCase() {
		return new DellCase();
	}

	@Override
	public Motherboard createMotherboard() {
		return new DellMotherBoard();
	}

	@Override
	public PowerSource createPowerSource() {
		return new DellPowerSource();
	}

	@Override
	public Processor createProcessor() {
		return new DellProcessor();
	}

	@Override
	public RAM createRam() {
		return new DellRAM();
	}

	@Override
	public VideoCard createVideoCard() {
		return new DellVideoCard();
	}

}