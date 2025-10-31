package InterviewNumbers;

public class Recursion {
	
	static void printNum(int num){
		if(num==0) {
			return;
		}
		System.out.println(num); // to reverse the numbers like 4 3 2 1
		printNum(num-1);
		//System.out.println(num); // to print up to 4 in linewise like 1 2 3 4
	}
	public static void main(String[] args) {
		int num=100;
		printNum(num);
	}
}
