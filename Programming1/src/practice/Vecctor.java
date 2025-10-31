package practice;

import java.util.List;
import java.util.Vector;

public class Vecctor {
	public static void main(String[] args) {
		List l=new Vector(3,2);// initial capacity,incremental capacity
		
		Vector v=new Vector();// it implements interface List so we can create objcet for sub class
		v.add(10);
		l.add(19);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(24);
		l.add(30);
		System.out.println(l);
		System.out.println(v);
	}

}
