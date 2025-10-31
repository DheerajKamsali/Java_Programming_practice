package practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHassh {
	
	public static void main(String[] args) {
		
        Map m=new LinkedHashMap();
        m.put(1001, "cherry"); // it removes first one with same key 
        m.put(1002, "pavi");
        m.put(1003, "afreen");
        m.put(1004, "prasanna");
        m.put(1001, "kanna"); // only this it will take
        m.put(1005, "kanna"); // but we can make same duplicate values not keys 
       // m.put(null,null); // it will work only one null
        m.put(1007,null); // it will work
        m.put(1008,null);  // it will work
        m.put(null, "baa");// it will also work 
        System.out.println(m);
	}

}
