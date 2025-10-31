package practice;

import java.util.TreeSet;

public class TreeSeet {
	
	public static void main(String[] args) {
		
		TreeSet s=new TreeSet(); // arranged based on ascending order and only homogeneous data , no null values
		                // used to maintain uniqueness
		s.add(10);
		s.add(80);
		//s.add("dheeraj"); // only homogenous type of data it stores 
		s.add(40);
		//s.add(null); // cannot store null values if it stores gives null pointer exception
		s.add(20);
		s.add(40); // not maintain insertion order  and no duplicate
		System.out.println(s);
	}

}
