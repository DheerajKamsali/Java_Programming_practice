package Arrays;

public class MaxOfSubArr {
	static int maxSubArr(int a[],int k) {
		
		int maxSum=0;
		for(int i=0;i<=a.length-k;i++) {	
			int sum=0;
			for(int j=i;j<i+k;j++) {
				
				sum +=a[j];
			}
			if(sum>maxSum) {
				
				maxSum=sum;
			}
	     }
		return maxSum;
	}
	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5,6,7,8,9};
		int k=3;
		int res=maxSubArr(a, k);
		System.out.println("max of sub array is : "+res);
		
	}
}