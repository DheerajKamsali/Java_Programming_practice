package practice;

public class TaskSynch {

	public static void main(String[] args) {

		Synchroniz s1=new Synchroniz();
	
		
		Trainer t1=new Trainer(s1, "dheeraj");
		Trainer t2=new Trainer(s1, "kumar");
		
		t1.start();
		t2.start();
		
	}

}
