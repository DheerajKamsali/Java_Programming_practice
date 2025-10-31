package Arrays;

import java.util.Arrays;

public class ArrayAntiClock {
	public static void main(String[] args) {
		
		int a[]= {12,23,34,45,56,67,78};
		int temp=a[0];
		
		for(int i=1;i<a.length;i++) {
			a[i-1]=a[i];
		}
		a[a.length-1]=temp;
		System.out.println(Arrays.toString(a));
	}

}
