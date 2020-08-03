package Creational.Factory_Method;

public class TruckDriver extends Driver {

	Vehicle getVehicle() {
		return new Truck();
	}
	
}