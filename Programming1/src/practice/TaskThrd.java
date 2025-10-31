package practice;

public class TaskThrd extends Thread{

	public TaskThrd() {
		start();
	}

	@Override
	public void run() {
		System.out.println(5+10);
	}
   } 



		
