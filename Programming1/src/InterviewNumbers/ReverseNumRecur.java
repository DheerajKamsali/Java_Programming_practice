package InterviewNumbers;

public class ReverseNumRecur {

	static int reverse=0;
	
	static int m(int num) {
		if(num==0) {
			return reverse;
		}else {
			reverse=(reverse*10)+(num%10);
			return m(num/10);
		}
	}
	public static void main(String[] args) {
		int num=1234;
		int res=m(num);
		System.out.println(res);
	}
}
