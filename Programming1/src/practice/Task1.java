package practice;

public class Task1 extends Thread{

		public Task1() {
			start();
		}

		@Override
		public void run() {	
			for(int i=0;i<=10;i++) {
				System.out.println("pentagon");
				try {
					Thread.sleep(3000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

