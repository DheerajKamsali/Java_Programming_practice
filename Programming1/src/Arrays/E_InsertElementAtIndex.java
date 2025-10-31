package Arrays;

public class E_InsertElementAtIndex {
	public static void main(String[] args) {
		int arr1[]= {10,20,30,40,50,60};
		int element=35;
		int index=3;
		
		int arr2[]=new int[arr1.length+1];
		
		for(int i=0;i<index;i++) {
			arr2[i]=arr1[i];
		}
		arr2[index]=element; //index 3=35;
		
		for(int i=index;i<arr1.length;i++) {
			arr2[i+1]=arr1[i];
			
		}
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}

}
