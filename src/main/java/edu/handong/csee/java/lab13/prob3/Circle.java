package edu.handong.csee.java.lab13.prob3;

public class Circle extends Shape{
	private double radious;
	
	public Circle(double r) {
		radious = r;
	}
	
	public double area() {
		return Math.PI * Math.pow(radious, 2);
	}
	
	public double perimeter() {
		return 2.0 * Math.PI * radious;
	}
	
	public double get_radious() {
		return radious;
	}
}
