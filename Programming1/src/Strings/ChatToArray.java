package Strings;

import java.util.Arrays;

public class ChatToArray {
	public static void main(String[] args) {
		
		String l="logic";
		// first method with out using built in
		
		char c[]=new char[l.length()];
		
		for(int i=0;i<l.length();i++) {
			c[i]=l.charAt(i);
		}
		System.out.println(Arrays.toString(c));
		
		// another logic built in
		
		char d[]=l.toCharArray();
		System.out.println(Arrays.toString(d));
	}

}
