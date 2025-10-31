package Operators;

class Logical {
	
	public static void main(String[] args) {
		int a=100;
		int b=700;
		int c=400;
		int res=0;
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		
		res=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("greater is: "+res);
	}

}
