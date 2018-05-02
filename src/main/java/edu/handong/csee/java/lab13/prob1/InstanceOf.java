package edu.handong.csee.java.lab13.prob1;   // package name

public class InstanceOf {   // class name
	public static void whatFriend(Friend friend) { // whatFriend method have friend parameter
		if(friend instanceof ClassFriend) {   // if friend class type = ClassFriend class type
			((ClassFriend) friend).classFriend();   // friend is class friend
		}
		else if(friend instanceof SchoolFriend) {   // if friend class type = SchoolFriend class type
			((SchoolFriend) friend).schoolFriend();   // friend is school friend
		}
		else {   // the other cases
			friend.justFriend();  // friend is just friend
		}
	}
}
