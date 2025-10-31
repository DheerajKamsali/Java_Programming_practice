package Arrays;

public class EvenOrOdd {
	public static void main(String[] args) {
		int a[]= {12,23,34,45,56,67,78};
		
		System.out.println("even values: ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("index " + i + "value "+a[i]);
			}
		}
		System.out.println();
		System.out.println("odd values: ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println("index " + i + "value "+a[i]);
	        }

         }
	}
}
