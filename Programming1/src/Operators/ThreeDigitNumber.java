package Operators;

import java.util.Scanner;

public class ThreeDigitNumber {

	public static void main(String[] args) {
		
  
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
         
         int a=sc.nextInt();
        		 
    	 if((a>100)&&(a<1000)){
        	
        	System.out.println("number "+a+" is three digit number ");
        
        }
        else {
        	System.out.println(a + " not a three digit");
        }
	}

}
