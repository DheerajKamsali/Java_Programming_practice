package Arrays;

import java.util.Scanner;

public class ArrayCration {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size: ");
		int size=sc.nextInt();
		int a[ ]= new int[size];
		System.out.println("enter the values : ");
		for(int i=0;i<size;i++) {
			
		  a[i]=sc.nextInt();
		}
		
		System.out.println("the array is: ");
		for(int i=0;i<size;i++) {
			System.out.println(a[i]);		
		}
				
	}

}
