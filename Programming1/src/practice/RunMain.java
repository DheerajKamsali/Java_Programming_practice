package practice;

public class RunMain {
	public static void main(String[] args) {
		
		ThrdRunnab t1=new ThrdRunnab();
		// or we can use Runnable also 
		Runnable r=new ThrdRunnab(); //it willl bnot invoke start() bca start methos extends thread .
		                           // to want that we should use create obj for thread
		Thread t=new Thread(r,"dheeraj"); // also use t1 // using overloaded constr3
		t.start();
		System.out.println(t.getName());
		
	}

}
