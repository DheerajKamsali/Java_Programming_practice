package practice;

import java.util.Enumeration;
import java.util.Vector;

public class Cursors { // used to traverse through collection
	
	public static void main(String[] args) {
		
		// enumertaion use with legacy classes i,e  vector
		
		Vector v=new Vector();
		v.add(10);
		v.add("dheeraj");
		v.add(40);
		System.out.println(v);
		
		Enumeration e=v.elements(); // only with legacy class
		
		while(e.hasMoreElements()) { // it check whether it has element or not if there through next() it prints
			
			System.out.println(e.nextElement()); // traverse through each element and prints in line 
		}
	}

}
