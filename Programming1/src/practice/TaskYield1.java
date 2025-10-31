package practice;

public class TaskYield1 extends Thread {

	@Override
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println("dheeraj");
		}
	}
}
