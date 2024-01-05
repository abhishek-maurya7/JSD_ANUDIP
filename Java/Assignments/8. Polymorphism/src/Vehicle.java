
public class Vehicle {
	void start() {
		System.out.println("Vehicle started.");
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		Motorcycle motorcycle = new Motorcycle();
		Garage garage = new Garage();
		
		garage.serviceVehicle(car);
		garage.serviceVehicle(motorcycle);
	}
}
