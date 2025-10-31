package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		
		int a[]= {12,23,34,45,56};
		int i=0;
		int j=a.length-1;
		while(i<j) {
			int temp=a[i]; // array reversal 56 45 34 23 12
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(a));
	}


}
