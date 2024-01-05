public class Motorcycle extends Vehicle{
	@Override
	void start() {
		System.out.println("Motorcycle Started.");
	}
	public static void main(String[] args) {
		Motorcycle m = new Motorcycle();
		m.start();
	}
}
