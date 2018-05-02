package edu.handong.csee.java.lab13.prob2;

public class Prob2 {
	public static void main(String[] args) {
		Book book = new Book("Simple Book");
		Science science = new Science("Hello Physics!", "ScienceWorld");
		History history = new History("What is History?", "E.H.Carr");
		
		book.show();
		science.show();
		history.show();
     }
}
