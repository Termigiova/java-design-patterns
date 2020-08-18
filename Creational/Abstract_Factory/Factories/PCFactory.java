package Creational.Abstract_Factory.Factories;

import Creational.Abstract_Factory.Products.Case;
import Creational.Abstract_Factory.Products.Motherboard;
import Creational.Abstract_Factory.Products.PowerSource;
import Creational.Abstract_Factory.Products.Processor;
import Creational.Abstract_Factory.Products.RAM;
import Creational.Abstract_Factory.Products.VideoCard;

public interface PCFactory {

	public Case createCase();

	public Motherboard createMotherboard();

	public PowerSource createPowerSource();

	public Processor createProcessor();

	public RAM createRam();

	public VideoCard createVideoCard();

}