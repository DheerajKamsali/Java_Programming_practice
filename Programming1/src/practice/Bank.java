package practice;

public class Bank {
	
	String accName;
	int balance;
	long accNumber;
	 Bank(String accName, int balance, long accNumber) {
		this.accName = accName;
		this.balance = balance;
		this.accNumber = accNumber;
	}

	void deposit(int balanceAmt) {
		
		this.balance +=balanceAmt;
		System.out.println("amount deposited "+ balanceAmt);
	}
	void withdraw(int cash) {
		
		this.balance -=cash;
		System.out.println("amount withdrawn "+ cash);
		
	}
	void balanceEnquiry() {
		System.out.println("amount left " +balance);
	}
	public static void main(String[] args) {
		 Bank b1=new Bank("123456", 5000, 998988);
		 
		 b1.deposit(500);
		 b1.withdraw(3000);
		 b1.balanceEnquiry();
	}
	
	

}
