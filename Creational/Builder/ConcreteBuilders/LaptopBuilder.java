package Creational.Builder.ConcreteBuilders;

import Creational.Abstract_Factory.Products.Case;
import Creational.Abstract_Factory.Products.Motherboard;
import Creational.Abstract_Factory.Products.PowerSource;
import Creational.Abstract_Factory.Products.Processor;
import Creational.Abstract_Factory.Products.RAM;
import Creational.Abstract_Factory.Products.VideoCard;
import Creational.Builder.PCBuilder;
import Creational.Builder.PCs.Laptop;

public class LaptopBuilder implements PCBuilder {

	private Laptop laptop;

	public LaptopBuilder() {
		laptop = new Laptop();
	}

	@Override
	public void reset() {
		laptop = new Laptop();
	}

	public Laptop getLaptop() {
		return laptop;
	}

	@Override
	public void setCase(Case pcCase) {
		laptop.setPcCase(pcCase);
	}

	@Override
	public void setType(String type) {
		laptop.setType(type);
	}

	@Override
	public void setMotherboard(Motherboard motherboard) {
		laptop.setMotherboard(motherboard);
	}

	@Override
	public void setPowerSource(PowerSource powerSource) {
		laptop.setPowerSource(powerSource);
	}

	@Override
	public void setProcessor(Processor processor) {
		laptop.setProcessor(processor);
	}

	@Override
	public void setRAM(RAM ram) {
		laptop.setRAM(ram);
	}

	@Override
	public void setVideoCard(VideoCard videoCard) {
		laptop.setVideoCard(videoCard);
	}

}