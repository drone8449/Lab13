package edu.handong.csee.java.lab13.prob4;   // package name

public class Cat extends Animal implements Pet {   // inheritance from Animal and implementation of Pet
	public String food() {   // method name
		return "(Cat!)" + "Fish";   // return message
	}
}
