package Creational.Builder.ConcreteBuilders;

import Creational.Abstract_Factory.Products.Case;
import Creational.Abstract_Factory.Products.Motherboard;
import Creational.Abstract_Factory.Products.PowerSource;
import Creational.Abstract_Factory.Products.Processor;
import Creational.Abstract_Factory.Products.RAM;
import Creational.Abstract_Factory.Products.VideoCard;
import Creational.Builder.PCBuilder;
import Creational.Builder.PCs.Desktop;

public class DesktopBuilder implements PCBuilder {

	private Desktop desktop;

	public DesktopBuilder() {
		desktop = new Desktop();
	}

	@Override
	public void reset() {
		desktop = new Desktop();
	}

	public Desktop getDesktopComputer() {
		return desktop;
	}

	@Override
	public void setType(String type) {
		desktop.setType(type);
	}

	@Override
	public void setCase(Case pcCase) {
		desktop.setPcCase(pcCase);
	}

	@Override
	public void setMotherboard(Motherboard motherboard) {
		desktop.setMotherboard(motherboard);
	}

	@Override
	public void setPowerSource(PowerSource powerSource) {
		desktop.setPowerSource(powerSource);
	}

	@Override
	public void setProcessor(Processor processor) {
		desktop.setProcessor(processor);
	}

	@Override
	public void setRAM(RAM ram) {
		desktop.setRAM(ram);
	}

	@Override
	public void setVideoCard(VideoCard videoCard) {
		desktop.setVideoCard(videoCard);
	}

}