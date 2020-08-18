package Creational.Abstract_Factory.Products;

public class PC {

	private Case pcCase;
	private Motherboard motherboard;
	private PowerSource powerSource;
	private Processor processor;
	private RAM ram;
	private VideoCard videoCard;

	public PC(Case pcCase, Motherboard motherboard, PowerSource powerSource, Processor processor, RAM ram,
			VideoCard videoCard) {
		this.pcCase = pcCase;
		this.motherboard = motherboard;
		this.powerSource = powerSource;
		this.processor = processor;
		this.ram = ram;
		this.videoCard = videoCard;
	}

	public void printPCParts() {
		System.out.println("This PC has the following parts: ");
		System.out.println(pcCase.getClass().getSimpleName());
		System.out.println(motherboard.getClass().getSimpleName());
		System.out.println(powerSource.getClass().getSimpleName());
		System.out.println(processor.getClass().getSimpleName());
		System.out.println(ram.getClass().getSimpleName());
		System.out.println(videoCard.getClass().getSimpleName());
	}

}