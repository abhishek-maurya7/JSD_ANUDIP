//abstract class with abstract methods
abstract class Shape {
	abstract double calculateArea();
}

//class extending an abstract class
class Circle extends Shape {
	double radius;
	//declaring constructor and assigning values to the instance variables
	Circle(double radius) {
		this.radius = radius;
	}

	//implementing abstract methods
	@Override
	double calculateArea() {
		return Math.PI * radius * radius;
	}
}

//extending abstract class 
class Rectangle extends Shape {
	//instance variables
	double height;
	double width;
	
	//declaring constructor and assigning values to instance varibales
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	//implementing abstract methods
	@Override
	double calculateArea() {
		return height * width;
	}
}

public class assignmentAbstractInterafce1 {
	//main class
	public static void main(String[] args) {
		//instantiating circle and rectangle classes and passing values to the constructor 
		Circle c1 = new Circle(5.2);
		Rectangle r1 = new Rectangle(4, 2.1);

		//calling methods of with objects
		System.out.println("Area of the circle: " + c1.calculateArea());
		System.out.println("Area of the rectangle: " + r1.calculateArea());	
	}

}
