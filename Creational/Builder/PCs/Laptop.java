package Creational.Builder.PCs;

import Creational.Abstract_Factory.Products.Case;
import Creational.Abstract_Factory.Products.Motherboard;
import Creational.Abstract_Factory.Products.PowerSource;
import Creational.Abstract_Factory.Products.Processor;
import Creational.Abstract_Factory.Products.RAM;
import Creational.Abstract_Factory.Products.VideoCard;

public class Laptop {

	private String type;
	private Case pcCase;
	private Motherboard motherboard;
	private PowerSource powerSource;
	private Processor processor;
	private RAM ram;
	private VideoCard videoCard;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Case getPcCase() {
		return pcCase;
	}

	public void setPcCase(Case pcCase) {
		this.pcCase = pcCase;
	}

	public Motherboard getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(Motherboard motherboard) {
		this.motherboard = motherboard;
	}

	public PowerSource getPowerSource() {
		return powerSource;
	}

	public void setPowerSource(PowerSource powerSource) {
		this.powerSource = powerSource;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public RAM getRAM() {
		return ram;
	}

	public void setRAM(RAM ram) {
		this.ram = ram;
	}

	public VideoCard getVideoCard() {
		return videoCard;
	}

	public void setVideoCard(VideoCard videoCard) {
		this.videoCard = videoCard;
	}

	public void printPCParts() {
		System.out.println("This is a " + type + " and has the following parts: ");
		System.out.println(pcCase.getClass().getSimpleName());
		System.out.println(motherboard.getClass().getSimpleName());
		System.out.println(powerSource.getClass().getSimpleName());
		System.out.println(processor.getClass().getSimpleName());
		System.out.println(ram.getClass().getSimpleName());
		System.out.println(videoCard.getClass().getSimpleName());
	}

}