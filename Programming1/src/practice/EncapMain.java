package practice;

public class EncapMain {
	
	public static void main(String[] args) {
		
		Encapsulation e=new Encapsulation("dheeraj",30);
//		e.setName("dheeraj");
//		e.setA(2);
//		e.setDate("feb");
		System.out.println(e.getName());
		System.out.println(e.getA());
		System.out.println(e.getDate());
	}

}
