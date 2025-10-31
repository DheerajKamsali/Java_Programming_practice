package Operators;

public class TernaryThree {

	public static void main(String[] args) {
          int a=10;
          int b=20;
          int c=30;
          int res=0;
          
         
         // res=(a>b)?((a>c)?a:c):((b>c)?b:c);
          
          res=(a>b)?((a>c)?a:c):((b>c)?b:c);
          
          System.out.println("greater="+res);
        		  
	}

}
