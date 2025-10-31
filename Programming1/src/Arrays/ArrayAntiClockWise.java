package Arrays;

import java.util.Arrays;

public class ArrayAntiClockWise {
	public static void main(String[] args) {
		int a[]= {12,23,34,45,56,67,78};
		int temp=a[a.length-1];
		
		for(int i=a.length-2;i>=0;i--) {
			a[i+1]=a[i];
			
		}
		a[0]=temp;
		System.out.println(Arrays.toString(a));
	}

}
