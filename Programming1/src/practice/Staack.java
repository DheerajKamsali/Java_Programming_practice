package practice;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Staack {
	public static void main(String[] args) {
		Stack s=new Stack();
		//Vector v=new Stack(); // it will work we cannot use stack methods 
		//s.add(10);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		System.out.println(s);
		System.out.println(s.peek()); // it prints top elenent from stack that is last entered which is first one
		s.pop();  // removes top element first , and we cannot use argument 
		System.out.println(s);
		System.out.println(s.search(10)); // it prints index of that value in stack  from top count starts 
		System.out.println(s.search(90)); //not present prints -1
	}

}
