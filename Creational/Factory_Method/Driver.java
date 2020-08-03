package Creational.Factory_Method;

public abstract class Driver {
	
	abstract Vehicle getVehicle();

	public void initialize() {
		// Inicialization procedures like:
		// Show your ID to the vehicle responsible
	}

	public void work() {
		Vehicle vehicle = getVehicle();
		System.out.print("Working on a " + vehicle.getClass().getSimpleName() + "!\n");
		vehicle.turnOn();
		vehicle.drive();
		// Some business logic like:
		// Fill gas
		// Go to designated routes
		// For each route retrieve or deliver designated packages
		// For each package make a register
	}

}