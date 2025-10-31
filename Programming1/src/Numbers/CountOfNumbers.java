package Numbers;

public class CountOfNumbers {
	
	static void getCount(int num) {
		int count=0;
		while(num!=0) {
			num /=10;
			count++;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		int num=98399893;
		getCount(num);
	}

}
