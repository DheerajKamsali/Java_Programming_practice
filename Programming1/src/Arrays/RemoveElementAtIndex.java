package Arrays;

public class RemoveElementAtIndex {
	
	public static void main(String[] args) {
		
		int arr1[]= {10,20,30,35,40,50,60};
		int index=3;
		int arr2[]=new int[arr1.length-1];
		
		for(int i=0;i<index;i++) {
			
			arr2[i]=arr1[i];
		}
		for(int i=index+1;i<arr1.length;i++) {
			
			arr2[i-1]=arr1[i]; //main logic
		}
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		}
	}

