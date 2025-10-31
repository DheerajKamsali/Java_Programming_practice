package practice;

public class Trainer extends Thread {
	
	Synchroniz s;
	String Tname;
	
	public Trainer(Synchroniz s, String tname) {
		this.s = s;
		Tname = tname;
	}
	@Override
	public void run() {
		s.classRoom(Tname);
	}
	
	
	
	

}
