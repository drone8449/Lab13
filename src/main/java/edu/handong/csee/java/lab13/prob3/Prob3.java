package edu.handong.csee.java.lab13.prob3;    // package name
import java.util.Scanner;   // import Scanner class

public class Prob3 {    // class name 
	public static void main(String[] args) {   // main method
		double n1, n2;   // double n1, n2
		Scanner keyboard = new Scanner(System.in);   // declare object 'keyboard' to use Scanner Class
		
		System.out.print("Enter radious: ");    // print message
		n1 = keyboard.nextDouble();    // input_double is n1
		Circle c1 = new Circle(n1);    // declare object 'c1' to use Circle Class
		
		System.out.println("Radious: " + c1.get_radious());   // print message
		c1.display();   // print area, perimeter
		
		System.out.print("Enter length and width: ");   // print message
		n1 = keyboard.nextDouble();   // input_double is n1
		n2 = keyboard.nextDouble();   // input_double is n2
		Rectangle r1 = new Rectangle(n1, n2);   // declare object 'r1' to use Rectangle Class
		
		System.out.println("Length: " + r1.get_Length());   // print rectangle's length
		System.out.println("Width: " + r1.get_Width());   // print rectangle's length
		r1.display();
	}
}
