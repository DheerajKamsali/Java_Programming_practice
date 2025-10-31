package J2ee;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the payment type: ");
		String type=sc.next();
		
		Payment p=Factory1.PaymentType(type);
		
		
		if(p!=null) {
			
			p.doPayment();
		}
		
	}

}
