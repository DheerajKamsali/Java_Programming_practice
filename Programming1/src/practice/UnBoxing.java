package practice;

public class UnBoxing {
	public static void main(String[] args) {
		
		Integer wi=new Integer("10");
		int i=wi;
		System.out.println(i);
		
		Double wd=new Double(30.0);
		double d=wd;
		System.out.println(d);
		
		String s1="30"; // parsing ()
		String s2="true";
		
		//System.out.println(Integer.parseInt(s1));
		Integer i1=Integer.parseInt(s1);
		System.out.println(i1);
		
		System.out.println(Boolean.parseBoolean(s2));
		
	}

}
