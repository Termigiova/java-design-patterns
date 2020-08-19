package Creational.Builder;

import Creational.Abstract_Factory.Products.Case;
import Creational.Abstract_Factory.Products.Motherboard;
import Creational.Abstract_Factory.Products.PowerSource;
import Creational.Abstract_Factory.Products.Processor;
import Creational.Abstract_Factory.Products.RAM;
import Creational.Abstract_Factory.Products.VideoCard;

public interface PCBuilder {

	public void reset();

	public void setType(String type);

	public void setCase(Case pcCase);

	public void setMotherboard(Motherboard motherboard);

	public void setPowerSource(PowerSource powerSource);

	public void setProcessor(Processor processor);

	public void setRAM(RAM ram);

	public void setVideoCard(VideoCard videoCard);

}