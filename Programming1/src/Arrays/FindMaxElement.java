package Arrays;

public class FindMaxElement {
	public static void main(String[] args) {
		int a[]= {-78,-64,-98,-53,-80,-37,-29};
		
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("max: "+max);
	}

}
