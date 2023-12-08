// interface
interface Shape {
    // Abstract method
    abstract double calculateArea();
}

//implementing interface
class Circle implements Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    //implementation of the abstract method
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class interfaceEg1 {
    public static void main(String[] args) {
        // Calling method 
        Circle c = new Circle(5.0);

        // Calling method 
        System.out.println("Area of Circle: " + c.calculateArea());
    }
}
