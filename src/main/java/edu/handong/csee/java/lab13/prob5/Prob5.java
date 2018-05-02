package edu.handong.csee.java.lab13.prob5;    // package name 
import java.util.Scanner;   // import Scanner class

public class Prob5 {  // class name
	public static boolean equals(int[][] m1, int[][] m2) {   // boolean method having parameter 2D array m1, m2
		int count = 0;   // integer count
		if (m1.length != m2.length) // if the number of row is different, return false
		return false;   // return false value 
		      for (int i = 0; i < m1.length; i++)    //  repeat from 0 to m1's length by 1
		      {
		            for (int j = 0; j < m1[i].length; j++)   // repeat from 0 to m1[i]'s length by 1
		            {
		                if (m1[i][j] != m2[i][j])   // if m1[i][j], m2[i][j] is different 
		                count++;   // count increase by 1
		            }
		      }
		      if(count <= 3)   // if count is lower than 4
		         return true;   // return true value
		      else   // else 
		         return false;   // return false value
	}
	
    public static void main(String[] args) {   // main method
		int n1, n2 = 0;   // integer n1, n2
		    	  
		Scanner keyboard = new Scanner(System.in);   // declare object 'keyboard' to use Scanner Class
		System.out.print("Enter row size(maximum 5): ");   // print message
	    n1 = keyboard.nextInt();   // next input is n1
	    System.out.print("Enter column size(maximum 5): ");   // print message
		n2 = keyboard.nextInt();   // next input is n2
		    	  
		int[][] m1 = new int[n1][n2];   // declare object 'm1' to use 2D array
		    	  
		System.out.print("Enter row size(maximum 5): ");  // print message
	    n1 = keyboard.nextInt();   // next input is n1
		System.out.print("Enter column size(maximum 5): ");  // print message
		n2 = keyboard.nextInt();   // next input is n2
		    	 
		int[][] m2 = new int[n1][n2];   // declare object 'm2' to use 2D array
	    System.out.print("Enter List1: ");   // print message
		    	     
	    for (int i = 0; i < m1.length; i++) {    // repeat from 0 to m1's length by 1
		    for (int j = 0; j < m1[i].length; j++)  // repeat from 0 to m1[i]'s length by 1
		    	     m1[i][j] = keyboard.nextInt();   // next input is m1[i][j]
	    }
	    
	    System.out.print("Enter list2: ");   // print message
	   
	    for (int i = 0; i < m2.length; i++){   // repeat from 0 to m2's length by 1
	       for (int j = 0; j < m2[i].length; j++)   // repeat from 0 to m2[i]'s length by 1
	             m2[i][j] = keyboard.nextInt();   // next input is m2[i][j]
	    }
	    
	    for (int i = 0; i < m1.length; i++){   // repeat from 0 to m1's length by 1
	       for (int j = 0; j < m1[i].length; j++)   // repeat from 0 to m1[i]'s length by 1
	         System.out.print(m1[i][j] + " ");  // print m1[i][j]
	       System.out.println();   // print void line
	    }
	    System.out.println();   // print void line
	    
	    for (int i = 0; i < m2.length; i++){   // repeat from 0 to m2's length by 1
	       for (int j = 0; j < m2[i].length; j++)   // repeat from 0 to m2[i]'s length by 1
	         System.out.print(m2[i][j] + " ");   // print m2[i][j]
	       System.out.println();  // print void line
	    }
	    
	    System.out.println();   // print void line
	                  
	    if (equals(m1, m2))   // if m1, m2 are equal
	       System.out.println("The two arrays are approximately identical.");   // print message
	    else    // else
	       System.out.println("The two arrays are not identical");   // print message
	}
}
