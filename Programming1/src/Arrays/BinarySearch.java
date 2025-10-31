package Arrays;


public class BinarySearch {
	
   static int binary(int a[] ,int element) {
	   int low=0;
	   int high=a.length-1;
	   int mid=0;
	   
	   while(low<=high) {
		   //System.out.println("Hii");
		   mid=(low+high)/2;
		   if(a[mid]==element) {
			   return mid;
		   }else if(element >a[mid]) {
			   low=mid+1;
			   
		   }else {
			   high=mid-1;
		     }
		  
		   }
	     return -1;
   }
   
   public static void main(String[] args) {
	   int a[]= {10,20,30,40,50,60};
	   
	   int element=60;
	   int res=binary(a,element);
	   if(res>=0) {
		   System.out.println("element found at index "+res);
	   }else {
		   System.out.println("element not found");
	   }
}
	
}

