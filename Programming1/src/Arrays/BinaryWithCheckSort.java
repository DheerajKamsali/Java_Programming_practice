package Arrays;

public class BinaryWithCheckSort {
	
	static boolean isSorted(int a[]) {
		for(int i=0;i<a.length-1;i++) { // one iteration enough to check
			if(a[i]>a[i+1]) {
				
				return false; // not sorted
			}
		}
		return true; // sorted
	}
	
	static int binary(int a[],int element) {
		int low=0;
		int high=a.length-1;
		int mid=0;
		while(low<=high){
			mid=(low+high)/2;
			if(a[mid]==element) {
				return mid;
			}else if(element>a[mid]) {
				low=mid+1;
			}else {
				
				high=mid-1;
			}
		}
		return -1;
	}
	static void sortMyArray(int a[]) {
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
	
}
	
	public static void main(String[] args) {
		int a[]= {10,5,77,3,52,8,16,13,32};
		int element=16;
		boolean res=isSorted(a);
		int binResult=0;
		if(res==true) {
			System.out.println("array sorted");
			binResult=binary(a, element);
		}else {
		   sortMyArray(a);
		   binResult=binary(a, element);
		}
		System.out.println("sorted array");{
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			if(binResult>=0) {
				System.out.println("element found at index "+binResult);
			}else {
				System.out.println("element not found in array ");
			}
		
	}

	}
}
