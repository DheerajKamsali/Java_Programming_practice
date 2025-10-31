package Numbers;

public class N_Reverse {
	static int getReverse(int num) {
		int res=0;
		while(num!=0) {
			int rem=num%10;
			res=res*10+rem;
			num=num/10;
		}return res;
	}
	public static void main(String[] args) {
		for(int i=11;i<=99;i++) { //// to print numbers reverse from 11 to 99
			int res=getReverse(i); // to print numbers reverse from 11 to 99
			System.out.println(res);	
		}
		int res=getReverse(98907);
		System.out.println(res);
	}
}
