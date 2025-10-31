package Arrays;

public class E_2NdMax {
	public static void main(String[] args) {
		
		int a[]= {78,64,98,53,80,37,29};
		int max1=0;
		int max2=0;
		
		if(a[0]>a[1]) {
			max1=a[0];
			max2=a[1];
		}else {
			max1=a[1];
			max2=a[2];
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
			}else if(a[i]>max2) {
				
				max2=a[i];
			}
		}
		System.out.println("second max : "+max2);
	}

}
