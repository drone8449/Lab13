package edu.handong.csee.java.lab13.prob4;   // package name

public class Dog extends Animal implements Pet {   // inheritance from Animal and implementation of Pet
	public String food() {   // method name
		return "(Dog!)" + "Sausage";   // return message
	}
}
