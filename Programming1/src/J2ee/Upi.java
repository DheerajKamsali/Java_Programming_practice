package J2ee;

public class Upi implements  Payment{

	@Override
	public void doPayment() {

		System.out.println("payment done by upi");
	}

}

class DebitCard implements Payment{

	@Override
	public void doPayment() {

		System.out.println("payment done through debit card");
	}
	
	
}

class CreditCard implements Payment{

	@Override
	public void doPayment() {

		System.out.println("payment done through credit card");
	}
	
}
