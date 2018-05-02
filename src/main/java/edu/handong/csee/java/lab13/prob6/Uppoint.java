package edu.handong.csee.java.lab13.prob6;   // package name 

public class Uppoint implements CapitalPrint {    // class is implementation of CapitalPrint 
	private int x, y;   // integer x, y

	Uppoint(int x, int y){   // Constructor having parameter x, y
		this.x = x;    // x is x
		this.y = y;   // y is y
	}

	public String toString(){   // method name
	   return "x : " + x + " y : " + y;   // return x, y
	}
}
