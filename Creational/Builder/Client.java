package Creational.Builder;

import Creational.Builder.Director;
import Creational.Builder.ConcreteBuilders.DesktopBuilder;
import Creational.Builder.ConcreteBuilders.LaptopBuilder;
import Creational.Builder.PCs.Desktop;
import Creational.Builder.PCs.Laptop;

public class Client {

	public static void main(String[] args) {
		Director director = new Director();
		DesktopBuilder desktopBuilder = new DesktopBuilder();
		LaptopBuilder laptopBuilder = new LaptopBuilder();

		// Build a new Apple Desktop Computer
		System.out.println("Creating an Apple Desktop Computer");
		director.constructAppleDesktopComputer(desktopBuilder);
		Desktop appleDesktopComputer = desktopBuilder.getDesktopComputer();
		appleDesktopComputer.printPCParts();

		// Build a Dell Desktop Computer
		System.out.println("Creating a Dell Desktop Computer");
		director.constructDellDesktopComputer(desktopBuilder);
		Desktop dellDesktopComputer = desktopBuilder.getDesktopComputer();
		dellDesktopComputer.printPCParts();

		// Build an Apple Laptop
		System.out.println("Creating an Apple Laptop");
		director.constructAppleLaptop(laptopBuilder);
		Laptop appleLaptop = laptopBuilder.getLaptop();
		appleLaptop.printPCParts();

		// Build an Apple Laptop
		System.out.println("Creating a Dell Laptop");
		director.constructDellLaptop(laptopBuilder);
		Laptop dellLaptop = laptopBuilder.getLaptop();
		dellLaptop.printPCParts();
	}

}