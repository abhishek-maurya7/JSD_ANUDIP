class Car {
    //Variable declaration
	String make;
	String model;
	short year;
	int price;
	
    //creating a constructor
	Car(String make, String model, short year, int price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
    //main method
	public static void main(String args[]) {
        //creating object of class Car and passing values to constructor
		Car c1 = new Car("Hyundai", "Xinon", (short) 2022, 125000);
		System.out.println("Make: " + c1.make + "\nModel: " + c1.model + "\nYear: " + c1.year + "\nPrice: " + c1.price);	

        //creating object of class Car and passing values to constructor
        Car c2 = new Car("Toyota", "Corolla", (short) 2023, 300000);
        System.out.println("Make: " + c2.make + "\nModel: " + c2.model + "\nYear: " + c2.year + "\nPrice: " + c2.price);
	}
}
