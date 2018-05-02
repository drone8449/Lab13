package edu.handong.csee.java.lab13.prob3;   // package name

public class Rectangle extends Shape{   // inheritance from Shape
	private double length;   // double length
	private double width;   // double width
	
	public Rectangle(double length, double width) {   // Constructor having parameter length, width
		this.length = length;   // length is length
		this.width = width;   // width is width
	}
	
	public double area() {   // method name
		return length * width;   // return area
	}
	
	public double perimeter() {   // method name 
		return 2*(length + width);   // return perimeter
	}
	
	public double get_Length() {   // method name 
		return length;   // return length
	}
	
	public double get_Width() {   // method name
		return width;  // return width
	}
}
