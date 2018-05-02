package edu.handong.csee.java.lab13.prob3;   // package name

public class Circle extends Shape{   // inheritance from Shape 
	private double radious;   // double radious
	
	public Circle(double r) {   // Constructor having parameter r
		radious = r;   // radious is r 
	}
	
	public double area() {   // method name 
		return Math.PI * Math.pow(radious, 2);   // return area 
	}
	
	public double perimeter() {   // method name 
		return 2.0 * Math.PI * radious;   // return perimeter
	}
	
	public double get_radious() {   // method name
		return radious;   // return radious
	}
}
