package Numbers;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n=sc.nextInt();
		//System.out.println("factors are : " + 1);
		
		for(int i=1;i<=n/2;i++) { // to reduce time complexity O(n) ==> O(n/2)
			if(n%i==0) {
				System.out.println("factors are : " + i);
			}
		}
		System.out.println("factors are : " + n);
	}

} 
