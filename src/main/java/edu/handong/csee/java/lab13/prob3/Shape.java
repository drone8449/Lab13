package edu.handong.csee.java.lab13.prob3;   // package name 

public abstract class Shape {   // abstract class Shape
	public abstract double area();   // abstract method area
	public abstract double perimeter();   // abstract method perimeter 
	
	public void display() {   // method name
		System.out.println("Area: " + area() + "\nPerimeter: " + perimeter() + "\n");   // print area, perimeter
	}
}
