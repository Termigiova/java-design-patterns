package Creational.Abstract_Factory.Factories;

import Creational.Abstract_Factory.Products.Case;
import Creational.Abstract_Factory.Products.Motherboard;
import Creational.Abstract_Factory.Products.PowerSource;
import Creational.Abstract_Factory.Products.Processor;
import Creational.Abstract_Factory.Products.RAM;
import Creational.Abstract_Factory.Products.VideoCard;
import Creational.Abstract_Factory.Products.Apple.AppleCase;
import Creational.Abstract_Factory.Products.Apple.AppleMotherBoard;
import Creational.Abstract_Factory.Products.Apple.ApplePowerSource;
import Creational.Abstract_Factory.Products.Apple.AppleProcessor;
import Creational.Abstract_Factory.Products.Apple.AppleRAM;
import Creational.Abstract_Factory.Products.Apple.AppleVideoCard;

public class AppleFactory implements PCFactory {

	@Override
	public Case createCase() {
		return new AppleCase();
	}

	@Override
	public Motherboard createMotherboard() {
		return new AppleMotherBoard();
	}

	@Override
	public PowerSource createPowerSource() {
		return new ApplePowerSource();
	}

	@Override
	public Processor createProcessor() {
		return new AppleProcessor();
	}

	@Override
	public RAM createRam() {
		return new AppleRAM();
	}

	@Override
	public VideoCard createVideoCard() {
		return new AppleVideoCard();
	}

}