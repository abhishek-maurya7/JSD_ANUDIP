package assignment1;
public class Bike extends Vehicle {
	Bike(String make, String model, int year, int maximumSpeed) {
		super(make, model, year, maximumSpeed);
	}

	@Override
	void drive() {
		System.out.println(make + " " + model + " Bike is driving.");
	}
}
