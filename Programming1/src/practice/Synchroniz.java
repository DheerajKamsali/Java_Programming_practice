package practice;

public class Synchroniz {
	
	synchronized void classRoom(String Tname) { // control over flow of execution not in an random order
		
		for(int i=1;i<=10;i++) {
			System.out.println("traner taking class "+Tname);
		}
		
	}

}
