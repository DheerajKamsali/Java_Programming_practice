package Patterns;

public class Alphabets {
	public static void main(String[] args) {
		//first way
		//for(int i=65; i<=90;i++) {
		    //  System.out.println((char)i); // A TO Z
			
			//second way
//			char c='A';
//			
//			for(int i=1;i<=26;i++) {
//				System.out.println(c);
//				c++;
				
				// alphabets in pattern
		       char c='A';
		        for(int i=1; i<=5;i++) {
		        	  
		        	   for(int j=1;j<=5;j++) {
		        		   
		        	   System.out.print(c +" "); // to print same letters in a row like  A A A A A 
		        	   //c++;// to print different letters ina each row; ;like A B C D E 
		        	                                                    //      E F G H I
		       
			}
		        System.out.println(); 
		       c++; // to print DIFFERENT LETTRS INA ROW LIKE  A B C D E
		}
	}
}