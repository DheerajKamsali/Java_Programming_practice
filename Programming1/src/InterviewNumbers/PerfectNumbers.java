package InterviewNumbers;

public class PerfectNumbers {
	public static void main(String[] args) {
		
		//int number=6 ,sum=0;
		for(int j=2;j<=1000;j++) { // to print perfect between numbers
			int sum=0;
		  for(int i=1;i<=j/2;i++) {
			
			if(j%i==0) {
				//sum=sum+i;
				sum +=i;
			}
		  }
		//System.out.println("sum ==> " +sum);
      	if(sum==j) {
      		System.out.println(j);
      	}
//		}else {
//			System.out.println("number is not an perfect number");
//		}
	  }
	}
}
