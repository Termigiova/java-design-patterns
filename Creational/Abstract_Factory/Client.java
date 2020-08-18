package Creational.Abstract_Factory;

import Creational.Abstract_Factory.Factories.AppleFactory;
import Creational.Abstract_Factory.Factories.DellFactory;
import Creational.Abstract_Factory.Factories.PCFactory;
import Creational.Abstract_Factory.Products.Case;
import Creational.Abstract_Factory.Products.Motherboard;
import Creational.Abstract_Factory.Products.PC;
import Creational.Abstract_Factory.Products.PowerSource;
import Creational.Abstract_Factory.Products.Processor;
import Creational.Abstract_Factory.Products.RAM;
import Creational.Abstract_Factory.Products.VideoCard;

public class Client {

	private PCFactory pcFactory;

	Client(PCFactory pcFactory) {
		this.pcFactory = pcFactory;
	}

	public PC buildPC() {
		Case pcCase = pcFactory.createCase();
		Motherboard motherboard = pcFactory.createMotherboard();
		PowerSource powerSource = pcFactory.createPowerSource();
		Processor pcProcessor = pcFactory.createProcessor();
		RAM ram = pcFactory.createRam();
		VideoCard videoCard = pcFactory.createVideoCard();

		return new PC(pcCase, motherboard, powerSource, pcProcessor, ram, videoCard);
	}

	public static void main(String[] args) {
		Client dellClient = new Client(new DellFactory());
		PC dellPC = dellClient.buildPC();
		dellPC.printPCParts();

		Client appleClient = new Client(new AppleFactory());
		PC applePC = appleClient.buildPC();
		applePC.printPCParts();
	}

}