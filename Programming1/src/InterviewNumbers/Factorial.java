package InterviewNumbers;

public class Factorial {
	static int fact(int num) {
		if(num==1) {
			return 1;
		}
		return num*fact(num-1); // first return 1 later ,it goes to another return untill fact 5
	}
	public static void main(String[] args) {
		int num=5;
		int f=fact(num);
		System.out.println(f);
	}
}
