package assignment2;

public class Shape {
	
	double getArea() {
		return 0.0;
	}
	public static void main(String[] args) {
		// Instantiating Circle, Square, and Rectangle
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(3, 6);

        // Calling getArea() method for each shape
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Rectangle Area: " + rectangle.getArea());
	}

}
class Circle extends Shape {
	double radius;
	
	//constructor
	Circle(double radius) {
		this.radius = radius;
	}
	
	//overriding inherited methods
	@Override
	double getArea() {
		return Math.PI * radius * radius;
	}
}

class Square extends Shape{
	int length;

    // Constructor for Square
    public Square(int length) {
        this.length = length;
    }

    // Override getArea method for Square
    @Override
    public double getArea() {
        return length * length;
    }
}

class Rectangle extends Shape{
	int width;
    int height;

    // Constructor for Rectangle
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Override getArea method for Rectangle
    @Override
    public double getArea() {
        return width * height;
    }
}