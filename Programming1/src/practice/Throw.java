package practice;

public class Throw {
	
	static void m1() {
		try {
		System.out.println(10/0); // it find the exception 
		}
		catch(ArithmeticException e) { //it catch that exception in try  
			System.out.println("hiii");
		    throw e;	 // it rethrows again exception..when a person call this methd they will solve this problem
		}
//		finally { // when exception occurs this block gets executed
//			//System.out.println(10/0);
//			System.out.println("i know above has error");
//		}
	}
	public static void main(String[] args) {
		try {
			Throw.m1(); // again calling that not solved problem
		}
		catch(ArithmeticException e) { // solving that problem here 
			System.out.println("exception handled"); 
		}
	}

}
