
public class Car extends Vehicle {
	@Override
	void start() {
		System.out.println("Car started.");
	}
	public static void main(String args[]) {
		Car c = new Car();
		c.start();
	}
}
