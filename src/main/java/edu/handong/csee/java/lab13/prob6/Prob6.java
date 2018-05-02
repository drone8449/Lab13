package edu.handong.csee.java.lab13.prob6;   // package name 

public class Prob6 {   // class name 
	public static void main(String[] args) {   // main method 
		Uppoint p1 = new Uppoint(3,3);   // declare p1 to use Uppoint class and inputed (3,3)
		Downpoint p2 = new Downpoint(2,5);    // declare p2 to use Downpoint class inputed (2,5)
		Downpoint p3 = new Downpoint(4,7);   // declare p3 to use Downpoint class inputed (4,7)
		Uppoint p4 = new Uppoint(9,12);   // declare p4 to use Uppoint class inputed (9,12)
		Printer.print(p1);   // print result of p1 
		Printer.print(p2);   // print result of p2
		Printer.print(p3);   // print result of p3
		Printer.print(p4);   // print result of p4
		}
}
