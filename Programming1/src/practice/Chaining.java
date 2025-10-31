package practice;

public class Chaining {
	int a;
	
	Chaining(){
		
		//this.a=10;
		this(20);
	}
	
	Chaining(int a){
		//this("dheeraj");
		System.out.println("cherry ur second");
	}
//	Chaining(){
//		System.out.println("success");
//	}
	public static void main(String[] args) {
		Chaining c=new Chaining();
		//System.out.println(c.a);
		
	}

}
