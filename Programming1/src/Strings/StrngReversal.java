package Strings;

public class StrngReversal {
	public static void main(String[] args) {
		
		String s="dheeraj";
		String res="";
		
//		for(int i=0;i<=s.length()-1;i++){
//	
//			char c=s.charAt(i);
//			res=c+res; // reversal
//			
			//res=res+c; // same order
			// another logic to traverse from reverse
			
			for(int j=s.length()-1;j>=0;j--) {
				char d=s.charAt(j);
				res =res+d;
			}
		
		System.out.println(res);
	}

}