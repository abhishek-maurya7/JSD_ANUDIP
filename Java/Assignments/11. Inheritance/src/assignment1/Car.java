package assignment1;
public class Car extends Vehicle {
	Car(String make, String model, int year, int maximumSpeed) {
		super(make, model, year, maximumSpeed);
	}
	@Override
	void drive() {
		System.out.println(make + " " + model + " Car is driving.");
	}
}
