package Strings;

public class StrLEnAndFetch {
	public static void main(String[] args) {
		
		String s="dheeraj";
		
		System.out.println("lenth of string is: "+s.length());
		
		// fetching
		for(int i=0;i<=s.length()-1;i++) {
			char c=s.charAt(i);
			System.out.println(c);
		}
	}

}
