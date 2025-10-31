package Arrays;

public class SortOfArray {
	public static void main(String[] args) {
		
	int a[]= {10,5,77,3,52,8,16,13,32};
	for(int j=0;j<a.length;j++) {
		for(int i=0;i<a.length-1;i++) {
			
			if(a[i]>a[i+1]) {
//				
//				int temp=a[i];
//				a[i]=a[i+1];
//				a[i+1]=temp;
				// with out using temp;
				a[i]=a[i]+a[i+1];
				a[i+1]=a[i]-a[i+1];
				a[i]=a[i]-a[i+1];
			}
		}
	}
	System.out.println("sorted array");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}

}
}