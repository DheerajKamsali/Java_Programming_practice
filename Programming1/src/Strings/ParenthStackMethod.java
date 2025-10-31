package Strings;

import java.util.Stack;

public class ParenthStackMethod {
	static boolean check(String p) {
		
		char arr[]=p.toCharArray();
		
		Stack s=new Stack();
		for(int i=0;i<arr.length;i++) {
			
			char c=arr[i];
			
			if(c=='{' || c=='[' || c=='(') {
				
				s.push(c);
			}
			if(c=='}' && s.peek().equals('{')) {
				s.pop();
			}
			if(c==']' && s.peek().equals('[')) {
				s.pop();
			}
			if(c==')' && s.peek().equals('(')) {
				s.pop();
			}
		}
		return s.isEmpty(); // if empty return true
	}
	public static void main(String[] args) {
		String input="(){}[]{";
		
		boolean res=check(input);
		if(res==true) {
			System.out.println("perfect parenthesis");
		}else {
			System.out.println("not perfect parenthesis");
		}
	}

}
