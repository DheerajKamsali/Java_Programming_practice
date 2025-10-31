package practice;

import java.util.ArrayList;
import java.util.List;

public class DemoArrLis {
	public static void main(String[] args) {
		
		List l4=new ArrayList(2); //initial array list capacity 2 means first it stores 10,20 later it resizes it 
		                          // bases on formula ((currentcapacity*3)/2)+1 later it add another elements  
		l4.add(10);
		l4.add(20);
		l4.add(30);
		l4.add(40);
		System.out.println(l4);
		
		List l5=new ArrayList(l4); // inserting all elements of l4 in l5
		System.out.println(l5);
	}

}
