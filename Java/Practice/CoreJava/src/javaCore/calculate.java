package javaCore;

import java.util.Scanner;

class Numbers {
    Scanner sc = new Scanner(System.in);
    int a;
    int b;

    void takeNumbers() {
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
    }
	
    int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}

// Inheriting properties and methods of Numbers class in Calculate
class calculate extends Numbers {
    public static void main(String args[]) {
        // Creating object of Calculate class
        calculate c = new calculate();
        
        // Calling method takeNumbers, add inherited from Numbers class
	c.takeNumbers();
        int result = c.add(c.a, c.b); //assigned number returned by add method to the result
        System.out.println("Addition is: " + result);
    }
}
