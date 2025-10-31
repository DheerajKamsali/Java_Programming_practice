package Numbers;

public class Table {
	public static void main(String[] args) {
		
		int n=10 ,sum=0;
		
		for(int i=1;i<=n;i++) {
			
			System.out.println(n + "X" + i + "="+ n*i);
			sum +=n*i;
		}
 	  System.out.println("the sum of multiple of n is : "+sum );
	}
}
