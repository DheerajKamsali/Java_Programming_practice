package Strings;

public class ConveWoUsingBuilt {
	
	public static void main(String[] args) {
		
		String input="PROGRAMMING";
		
		for(int i=0;i<=input.length()-1;i++) {
			char c=input.charAt(i);
			int a=(int)c; // converting char into ASCI int
			a=a+32; // add 32 convert upper to smaller
			System.out.println((char)a);
			
		}
		System.out.println();
          String input2="computer";
		
		for(int i=0;i<=input2.length()-1;i++) {
			char c=input2.charAt(i);
			int a=(int)c; // converting char into ASCI int
			a=a-32; // sub 32 convert lower to upper
			System.out.println((char)a);
	}

 }
}