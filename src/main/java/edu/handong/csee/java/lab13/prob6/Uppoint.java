package edu.handong.csee.java.lab13.prob6;

public class Uppoint implements CapitalPrint {
	private int x, y; 

	Uppoint(int x, int y){
		this.x = x; 
		this.y = y;
	}

	public String toString(){
	   return "x : " + x + " y : " + y;
	}
}
