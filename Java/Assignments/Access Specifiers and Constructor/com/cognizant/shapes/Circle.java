/**
 * 
 */
package com.cognizant.shapes;

/**
 * 
 */
public class Circle {

	/**
	 * 
	 */
	private float radius;
	float pi;
	
	
	public float getRadius() {
		return radius;
	}

	public Circle() {
		radius = 1.5f;
		pi = 3.5f;
	}
	public Circle(float radius) {
		this(radius, 3.5f);
	}
	
	private Circle(float radius, float pi) {
		this.radius = radius;
		this.pi = pi;
	}
	
	float calculateCircleArea(float radius) {
		return this.pi * radius * radius;
	}
	float calculateCircumference(float radius) {
		return 2 * this.pi * radius;
	}

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("Area of circle: " + circle.calculateCircleArea(2.1f));
		System.out.println("circumference of circle: " + circle.calculateCircumference(2.1f));
	}

}
