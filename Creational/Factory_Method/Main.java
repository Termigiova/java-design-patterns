package Creational.Factory_Method;

class Factory_Method {
	public static void main(String[] args) {
		Driver truckDriver = new TruckDriver();
		truckDriver.initialize();
		truckDriver.work();

		Driver carDriver = new CarDriver();
		carDriver.initialize();
		carDriver.work();
	}
}