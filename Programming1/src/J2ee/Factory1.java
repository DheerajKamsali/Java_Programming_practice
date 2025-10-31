package J2ee;


public class Factory1 {
	
	public static Payment PaymentType(String type)
	{
		
		if(type.equalsIgnoreCase("Upi")) {
			return new Upi();
		}
		else if(type.equalsIgnoreCase("Debit")) {
			return new DebitCard();
		}
		else if(type.equalsIgnoreCase("credit")) {
			return new CreditCard();
		}
		else {
			System.err.println("payment option not available");
			return null;
		}

    }
}

		
			
			
		