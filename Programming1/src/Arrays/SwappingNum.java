package Arrays;

public class SwappingNum {
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=0;
		// with using third vaiable
//	    c=a;
//		a=b;
//		b=c;
//		
		
		// with out using third variable 
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		// another logic 
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("afer swapping "+"a =" +a +" b= "+b);
	}

}
