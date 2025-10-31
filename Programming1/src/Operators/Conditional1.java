package Operators;

import java.util.Scanner;

public class Conditional1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int a=sc.nextInt();
		
		if(a>10) {
			System.out.println("a is greater");

		}
            
		else if(a<10) {
			System.out.println("a is smaller");
		}
		else {
			System.out.println("a is zero");
		}
	}

}
 