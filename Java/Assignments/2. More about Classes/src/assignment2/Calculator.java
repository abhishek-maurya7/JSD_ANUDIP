package assignment2;

public class Calculator {
	//creating method with two int parameters
    int add(int a, int b) {
        return a + b;
    }
    
    //creating method with three int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    //creating method with two double parameters
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String args[]) {
        //creating objects of the class calculator
        Calculator c = new Calculator();

        //calling methods and printing value returned by them
        System.out.println("First method returned: " + c.add(5, 4));
        System.out.println("Second method returned: " + c.add(5, 4, 2));
        System.out.println("Third method returned: " + c.add(5.1, 4.1));
    }
}
