package practice;

import java.util.Iterator;
import java.util.Vector;

public class CursorIterator {
	
	public static void main(String[] args) {
		
		//used with entire colllection //only forward direction 
		
		Vector v=new Vector();
		v.add(10);
		v.add(30);
		v.add("dheeraj");
		
		Iterator e=v.iterator();
		
		while(e.hasNext()) { // it checks for next element if true 
			System.out.println(e.next());// next() nethod prints that element
		}
	}

}
