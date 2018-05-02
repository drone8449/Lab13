package edu.handong.csee.java.lab13.prob2;   // package name

public class History extends Book{   // inheritance from Book
	private String author;   // string author
	
	public History(String Name, String Author) {   // constructor having parameter Name and Author
		super(Name);   // up_casting to Book 
		this.author = Author;   // Author is author
	}
	
	public String toString(){   // method name
		return super.toString() + "\n\tAuthor: " + author;   // return Id, Book name and author
	}
	
	public void show() {   // method show
		System.out.println("<<<History>>>" + this.toString());   // print Id, Book name and author
	}
}
