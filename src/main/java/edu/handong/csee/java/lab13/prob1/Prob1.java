package edu.handong.csee.java.lab13.prob1;   // package name

public class Prob1 {   // class name
	public static void main(String[] args) {   // main method
		Friend friend1 = new Friend();   // declare object 'friend1' to use Friend Class
		SchoolFriend friend2 = new SchoolFriend();   // declare object 'friend2' to use SchoolFriend Class
		ClassFriend friend3 = new ClassFriend();   // declare object 'friend3' to use ClassFriend Class
		
		InstanceOf.whatFriend(friend1);   // get friend type and print 
		InstanceOf.whatFriend(friend2);   // get friend type and print
		InstanceOf.whatFriend(friend3);   // get friend type and print 
	}
}
