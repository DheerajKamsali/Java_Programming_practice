package practice;

public class Encapsulation {
	
	private String name;
	private int a;
	final private String date="october";

	public Encapsulation(String name, int a) {
		this.name = name;
		this.a = a;
		//this.date = date;
	}

	public String getName() {
		return name;
	}
	
	public int getA() {
		return a;
	}
	
	public String getDate() {
		return date;
	}
	
}
