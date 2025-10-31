package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lissst {
	public static void main(String[] args) {
	 List l1=new ArrayList();
	 l1.add(20);
	 l1.add(30);
	 l1.add(40);
	 l1.add(50);
	 l1.add(20);
	 l1.add("dheeraj");
	 l1.add(null);
	 System.out.println(l1);
	 l1.add(0, 10); // used to add element at certain index
	 System.out.println(l1);
	 System.out.println(l1.indexOf(10)); // returns index of that element 
	 List l2=new ArrayList();
	 l2.add("rohith");
	 l2.add(45);
	 l2.add("mi");
	 
	 l1.addAll(1, l2); // method
	 System.out.println(l1);
	 
	 System.out.println(l1.get(1)); // returns element at that index position // use with sop
	 System.out.println(l1.set(5, "cherry"));// replace a value at certain index position and old value removed and separtely store in variable
	 //System.out.println(l1.remove(5)); // removes element at certain index position
	 System.out.println(l1);
	 System.out.println(l1.indexOf(20)); // returns first occurence index from begining
	 System.out.println(l1.lastIndexOf(20)); // returns last occurence index from beginning
 	
	}

}
