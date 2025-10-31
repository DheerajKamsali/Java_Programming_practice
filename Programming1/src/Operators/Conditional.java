package Operators;

import java.util.Scanner;

public class Conditional {
	
	public static void main(String[] args) {
	
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter a number:");
   
    int c=sc.nextInt();
   
    if(c>10) {
	    
	    System.out.println("Larger number");
	   
    }
    else if(c==10) {
	   System.out.println("equal to 10");
   }
    else {
    	
    	System.out.println("smaller than 10");
    }
    

	}
	
}	
