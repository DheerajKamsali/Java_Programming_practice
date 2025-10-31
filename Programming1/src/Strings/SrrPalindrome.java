package Strings;

public class SrrPalindrome {
	
	static String reverse(String value) {
		
		String res="";  // space matters
		for(int i=0;i<=value.length()-1;i++) {
			
			char c=value.charAt(i);
			
			res=c+res; // palindrome
		}
		return res;
	}
	public static void main(String[] args) {
		
		String value="MADAM";
		String res=reverse(value);
		if(value.equals(res)) { //== compares address and equals compares data 
			System.out.println("it is a palindrome");
		}else {
			System.out.println("not an palindrome");
		}
		
	}

}
