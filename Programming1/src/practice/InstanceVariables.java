package practice;

public class InstanceVariables {
	
	int a=10;
	String name="dheeraj";
	public static void main(String[] args) {
		InstanceVariables i=new InstanceVariables();
		System.out.println(i.name);
		System.out.println(i.a);
		InstanceVariables i1=new InstanceVariables();
		System.out.println(i1.name);
		System.out.println(i1.a);
	}

}
