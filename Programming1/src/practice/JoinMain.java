package practice;

public class JoinMain {
	
	public static void main(String[] args) {

				Join1 j=new Join1();
				j.start();
				
				Thread.yield();
//				try {
//					j.join();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
				
//				}catch(Exception e) {
//					
//					e.printStackTrace();
//				}
				for(int i=1;i<=10;i++) {
					System.out.println("hiii");
				}				

          	}

          }
