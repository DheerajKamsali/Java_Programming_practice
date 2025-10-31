package practice;

import java.util.HashSet;
import java.util.List;

public class Hasshset {
	public static void main(String[] args) {
		
		HashSet s=new HashSet(); // no insertion order based on Hashcode
		s.add(10);
		s.add("dheeraj");
		s.add(20);
		s.add(30);
		s.add(20); // no duplicate 
		s.add(null);
		s.add(null); // only one null allowed
		System.out.println(s);
		HashSet s1=new HashSet(s); // take s values into s1
		s.add(80);
		s1.add(99);
		System.out.println(s1);
	}

}
