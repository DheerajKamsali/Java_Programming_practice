package practice;

public class TaskYield extends Thread {

	@Override
	public void run() {
		
		for(int i=1;i<=10;i++) {
			System.out.println("pentagon");
			if(i==5) {
				Thread.yield();
			}
//			try {
//				Thread.sleep(3000);
//		}catch(Exception e) {
//			System.out.println("handle");
//				
//			}
		}
	}
}
