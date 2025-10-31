package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maaap {
	public static void main(String[] args) {
		
		Map m=new HashMap();
		
		m.put(1001, "dheeraj");
		m.put(1002, "raj");
		m.put(1003, "rajesh");
		m.put(1004, "rajanna");
		m.put(1005, "dhanu");
		//m.remove(1001);  // removes key and value
		//m.remove(1001, "dheeraj"); // removes key and value
		m.put(null, "anna");  // maintain insertion but wehen we use null it kept in first position
		m.put(1006, "dheeraj");  // when use with same key it removes previous key and value
		                     // allows duplicate values but not keys 
		System.out.println(m);
		
		System.out.println(m.keySet()); // print in same line like collection
		
		Set s=m.keySet(); // it prints only key values using for each loop
		
		for(Object l:s) { // iterate through value and prints each after each
			System.out.println(l);	
		}
		
		System.out.println(m.containsKey(1001)); // if key present returns true value
		System.out.println(m.containsValue("dheeraj")); // if present true 
		System.out.println(m.isEmpty()); // if empty retuns true or false
		m.clear(); // clear all elements in set
		System.out.println(m);
		
		
	}

}
