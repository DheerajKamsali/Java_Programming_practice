package practice;

import java.util.Map;
import java.util.TreeMap;

public class TreeeMap {
	public static void main(String[] args) {
		
		Map m=new TreeMap(); // sorted based on keys not values ,, not a hash based tree
		m.put(10002, "raja");
		m.put(10007, "maxa");  // order based on ascending 
		m.put(10005, "baja");
		m.put(10001, "gana");
		m.put(10004, "raja"); // allow duplicate values
		//m.put(null, "kana"); // cammot accept one null also
		//m.put(null, null);// cannot accept 
		System.out.println(m);
	}

}
