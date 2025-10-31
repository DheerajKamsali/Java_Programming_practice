package practice;

import java.util.ArrayList;
import java.util.Collections;

public class ColllectionClasss {
	
	public static void main(String[] args) {
		
		ArrayList s=new ArrayList();
		s.add(100);
		s.add(200);
		s.add(50);
		s.add(10);
		System.out.println(s);
		
		//Collections.sort(s); // arrange in ascending based on object values
		//System.out.println(s);
		Collections.reverse(s); // keeps in reverse
		System.out.println(s);
	}

}
