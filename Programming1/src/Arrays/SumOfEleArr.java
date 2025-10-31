package Arrays;

import java.util.Scanner;

public class SumOfEleArr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the size of array : ");
		int sum=0;
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("sum of elements is :" +sum);
	}

}
