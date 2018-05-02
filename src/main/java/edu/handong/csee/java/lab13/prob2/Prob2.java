package edu.handong.csee.java.lab13.prob2;   // package name

public class Prob2 {   // class name
	public static void main(String[] args) {   // main method
		Book book = new Book("Simple Book");   // declare object 'book' to use Book Class
		Science science = new Science("Hello Physics!", "ScienceWorld");  // declare object 'science' to use Science Class
		History history = new History("What is History?", "E.H.Carr");    // declare object 'history' to use History Class
		
		book.show();   // print Id and Book name value
		science.show();   // print Id, Book name and publisher
		history.show();   // print Id, Book name and author
     }
}
