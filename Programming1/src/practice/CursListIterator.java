package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CursListIterator {
	public static void main(String[] args) {
		
		//list iterator traverse only implementation classes of list interface
		// with this we can use bi-directinal forwaard and backward
		
		List l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add("dheeraj");
		
		//ListIterator l=l1.listIterator(); // no output bcz it down of this it checks starts index with 1st 
		                            // for first element there is no previous it cant enter wjhile to over come this
		                       // we use argument (l1.size()) it will give length of l1 and pass that as 
		            // argument to l , so it start with last index
		ListIterator l=l1.listIterator(l1.size()); // it pass size to l and it start from last 
		
		ListIterator l2=l1.listIterator();
//		 for backward
		while(l.hasPrevious()) {
			System.out.println(l.previous()); // prints i n revrse 
		}
		// forward direction
		while(l2.hasNext()) {
			System.out.println(l2.next());
		}
		
		
	}

}
