package practice;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int size=sc.nextInt();
		
		//int a[]=new int[size];
		String a[]=new String[size];
		System.out.println("enter the array elements: ");
		for(int i=0;i<=a.length-1;i++) {  //length function used to iterate up to array elements
			//a[i]=sc.nextInt();
			a[i]=sc.next();
		}
		 //int (s:a){
		for(String s:a) {  /// for each loop syntax is data type variable , reference
		System.out.println("array elements are: "+s);
		//System.out.println(a[4]);
		}
	}

}
