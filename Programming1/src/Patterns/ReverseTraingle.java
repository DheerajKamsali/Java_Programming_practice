package Patterns;

public class ReverseTraingle {
	public static void main(String[] args) {
		int row=5;
		for(int i=1; i<=row;i++) {
			
			for(int j=1;j<=row+1-i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
			
		}
		
	// easy way 
	for(int k=1;k<=row;k++) {
		
		for(int l=5; l>=k;l--) {
			System.out.print("*"+" ");
		}
		System.out.println();
	}

}
}

