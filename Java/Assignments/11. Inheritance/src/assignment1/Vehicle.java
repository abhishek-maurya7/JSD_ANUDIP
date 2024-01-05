package assignment1;

public class Vehicle {
	//instance variables
	String make;
	String model;
	int year;
	int maximumSpeed;
	
	//declaring parameterized constructors
	Vehicle(String make, String model, int year, int maximumSpeed) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.maximumSpeed = maximumSpeed;
	}
	
	//method
	void drive() {
		System.out.println(make + " " + model + " is driving.");
	}
	
	//main method
	public static void main(String[] args) {
		Car c1 = new Car("Tata", "Nano", 2010, 180);
		Bike b1 = new Bike("Hero", "Honda", 2009, 120);
		
		System.out.println("Make: " + c1.make + "\nModel: " + c1.model + "\nYear: " + c1.year + "\nMax Speed: " + c1.maximumSpeed);
		c1.drive();
		
		System.out.println();
		
		System.out.println("Make: " + b1.make + "\nModel: " + b1.model + "\nYear: " + b1.year + "\nMax Speed: " + b1.maximumSpeed);
		b1.drive();
	}

}
