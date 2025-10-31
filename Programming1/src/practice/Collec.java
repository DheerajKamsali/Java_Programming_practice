package practice;

import java.util.ArrayList;
import java.util.Collection;

public class Collec {
	
	public static void main(String[] args) {
		Collection c=new ArrayList();
		
		c.add(10);
		c.add(20);
		c.add(20);
		c.add("dheeraj");
		c.add(40.98);
		System.out.println(c);
		
		Collection c1=new ArrayList();
		c1.add(40);
		c1.add(39);
		c1.add(null);
		
		c.addAll(c1); // add all c1 object elements into c object or collection
		System.out.println(c);
		
		c.remove("dheeraj");
		System.out.println(c); // removes dheeraj from c
		
		c.removeAll(c1); // remove all c1 from c 
		System.out.println(c);
		
		c1.clear(); // makes the collection empty or it removes elements from collection
		System.out.println(c1);
		
	}

}
