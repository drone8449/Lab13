package edu.handong.csee.java.lab13.prob6;   // package name

public class Printer {   // class name 
	public static void print(Object object) {   // method having parameter object
		String str = object.toString();   // str is object.toString
		if(object instanceof CapitalPrint)   // if object class type and CapitalPrint class type are same
			str = str.toUpperCase();   // str is transformed to uppercase
		System.out.println(str);   // print str
	}
}
