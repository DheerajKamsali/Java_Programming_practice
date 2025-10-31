package practice;

import java.util.LinkedHashSet;

public class LinkedHasshSet {
	public static void main(String[] args) {
		
		LinkedHashSet s=new LinkedHashSet(); // maintain insertion order
		s.add(10);
		s.add(10); // no duplicate values 
		s.add("dheeraj");
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(null); // can stores null values // only one null
		s.add(null); // can stores null values
		s.add(30);
		
		System.out.println(s);
		
	}

}
