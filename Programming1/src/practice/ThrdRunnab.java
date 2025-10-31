package practice;

public class ThrdRunnab implements Runnable {

	@Override
	public void run() {

		for(int i=0;i<10;i++) {
			System.out.println("pentagon");
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println("handled");
			}
		}
	}
	
}
