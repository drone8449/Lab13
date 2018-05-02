package edu.handong.csee.java.lab13.prob2;   // package name

public class Science extends Book{   // inheritance from Book
	private String publisher;   // string publisher
	
	public Science(String Name, String Publisher) {   // constructor having parameter Name and Publisher
		super(Name);   // up_casting to Book 
		this.publisher = Publisher;    // publisher is Publisher
	}
	
	public String toString() {   // method name
		return super.toString() + "\n\tPublisher: " + publisher;  // return Id, Book name and publisher
	}
	
	public void show() {   // method name
		System.out.println("<<<Science>>>" + this.toString());   // print Id, Book name and publisher
	}
}
