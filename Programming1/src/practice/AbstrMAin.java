package practice;

public class AbstrMAin extends Abstr {

	@Override
	void m1() {  // abstract method overriding bcz we are extending abstract class
		System.out.println("abstr method implementation");
	}
	public static void main(String[] args) {
		
		Abstr m=new AbstrMAin(); // we can use up-casting
		AbstrMAin m1=new AbstrMAin(); //we can use normal method of obj creation of sub class and call super class
		m.main(); // concrete method of abstr
		
		m1.m1(); // abstract method of abstr
	}
	
}
