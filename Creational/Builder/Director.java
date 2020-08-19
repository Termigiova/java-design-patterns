package Creational.Builder;

import Creational.Abstract_Factory.Products.Apple.AppleCase;
import Creational.Abstract_Factory.Products.Apple.AppleMotherBoard;
import Creational.Abstract_Factory.Products.Apple.ApplePowerSource;
import Creational.Abstract_Factory.Products.Apple.AppleProcessor;
import Creational.Abstract_Factory.Products.Apple.AppleRAM;
import Creational.Abstract_Factory.Products.Apple.AppleVideoCard;
import Creational.Abstract_Factory.Products.Dell.DellCase;
import Creational.Abstract_Factory.Products.Dell.DellMotherBoard;
import Creational.Abstract_Factory.Products.Dell.DellPowerSource;
import Creational.Abstract_Factory.Products.Dell.DellProcessor;
import Creational.Abstract_Factory.Products.Dell.DellRAM;
import Creational.Abstract_Factory.Products.Dell.DellVideoCard;

public class Director {

	public void constructAppleDesktopComputer(PCBuilder builder) {
		builder.reset();
		builder.setType("Desktop Computer from Apple");
		builder.setCase(new AppleCase());
		builder.setMotherboard(new AppleMotherBoard());
		builder.setPowerSource(new ApplePowerSource());
		builder.setProcessor(new AppleProcessor());
		builder.setRAM(new AppleRAM());
		builder.setVideoCard(new AppleVideoCard());
	}

	public void constructDellDesktopComputer(PCBuilder builder) {
		builder.reset();
		builder.setType("Desktop Computer from Dell");
		builder.setCase(new DellCase());
		builder.setMotherboard(new DellMotherBoard());
		builder.setPowerSource(new DellPowerSource());
		builder.setProcessor(new DellProcessor());
		builder.setRAM(new DellRAM());
		builder.setVideoCard(new DellVideoCard());
	}

	public void constructAppleLaptop(PCBuilder builder) {
		builder.reset();
		builder.setType("Laptop from Apple");
		builder.setCase(new AppleCase());
		builder.setMotherboard(new AppleMotherBoard());
		builder.setPowerSource(new ApplePowerSource());
		builder.setProcessor(new AppleProcessor());
		builder.setRAM(new AppleRAM());
		builder.setVideoCard(new AppleVideoCard());
	}

	public void constructDellLaptop(PCBuilder builder) {
		builder.reset();
		builder.setType("Laptop from Dell");
		builder.setCase(new DellCase());
		builder.setMotherboard(new DellMotherBoard());
		builder.setPowerSource(new DellPowerSource());
		builder.setProcessor(new DellProcessor());
		builder.setRAM(new DellRAM());
		builder.setVideoCard(new DellVideoCard());
	}

}