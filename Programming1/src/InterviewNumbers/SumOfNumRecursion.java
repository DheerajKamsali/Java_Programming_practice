package InterviewNumbers;

public class SumOfNumRecursion {
	
	static int sumOfDigits(int num) {
		
		if(num==0) {
			return 0;
		}else {
			return(num%10)+sumOfDigits(num/10);
		}
	}
	public static void main(String[] args) {
		int number=1234;
		int res=sumOfDigits(number);
		System.out.println(res);
	}

}
