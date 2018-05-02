package edu.handong.csee.java.lab13.prob2;   // package name

public class Book {   // class name
	private static int idCount = 0;   // integer idCount
	private String BookName;   // String BookName
	private int id;   // integer id
	
	public Book(String Name) {   // Constructor having parameter Name
		this.BookName = Name;   // Name is BookName
		idCount++;   // idCount is increasing by 1
		id = idCount;   // id is idCount
	}
	
	public String toString() {   // method name
		return "\n\tId: " + id + "\n\tBook Name: " + BookName;   // return Id and Book name value
	}
	
	public void show() {   // method name
		System.out.println("<<<BOOK>>>" + this.toString());   // print Id and Book name value
	}
}
