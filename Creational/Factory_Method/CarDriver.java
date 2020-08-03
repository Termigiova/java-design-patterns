package Creational.Factory_Method;

public class CarDriver extends Driver {

	Vehicle getVehicle() {
		return new Car();
	}
	
}