package practice;

public class NamingConst extends Thread {
//    // method 1 using constructor
	public NamingConst() { // default value is -0
		super();
	}
	public static void main(String[] args) {
		
		//method 2 using setname()
		NamingConst t1=new NamingConst();
		//NamingConst t2=new NamingConst();
		
//		t1.setName("thread1");
//		t2.setName("thread2");
		
		System.out.println(t1.getName()); // used to get constructor name
		//System.out.println(t2.getName()); // used to get constructor name
		// if we dont set names then default values for thread is -0, -1 for t1 and t2
	}
}
