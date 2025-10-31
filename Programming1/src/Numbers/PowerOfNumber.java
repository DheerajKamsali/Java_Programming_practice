package Numbers;

public class PowerOfNumber {
	
	static int power(int base ,int power) {
		int res=1;
		for(int i=1;i<=power;i++) {
			res *=base;
		}
		return res;
	}
	public static void main(String[] args) {
		
		int num=5;
		int power=3;
		System.out.println("power is " + power(num,power));
	}

}
