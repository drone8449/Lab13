package edu.handong.csee.java.lab13.prob4;   // package name
import java.util.Scanner;   // import Scanner class

public class Prob4 {   // class name
	public void feed(Pet pet) {   // method having parameter pet
		System.out.println("feed: " + pet.food());   // print feed
	}
	
	public static void main(String[] args) {   // main method
		String cat_name, dog_name;   // string cat_name, dog_name
		
		Prob4 master = new Prob4();   // declare object 'master' to use Prob4 Class
		Cat cat = new Cat();   // declare object 'cat' to use Cat Class
		Dog dog = new Dog();   // declare object 'dog' to use Dog Class
		
		Scanner keyboard = new Scanner(System.in);   // declare object 'keyboard' to use Scanner Class
		System.out.print("Enter the cat name and dog name: ");   // print message
		cat_name = keyboard.next();   // next input is cat_name
		dog_name = keyboard.next();   // next input is dog_name
		
		cat.setName(cat_name);   // set cat's name
		cat.getName();   // print cat's name
		master.feed(cat);   // print cat's feed
		
		dog.setName(dog_name);   // set dog's name
		dog.getName();   // print dog's name
		master.feed(dog);   // print dog's feed
	}
}
