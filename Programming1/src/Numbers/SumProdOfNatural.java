package Numbers;

public class SumProdOfNatural {
	public static void main(String[] args) {
		
		int n=5 ,sum=0 ,prod=1;
		
		for(int i=1;i<=n;i++) {
			//sum=sum+i;
			sum += i;
			prod *=i;
		}
		System.out.println("sum is :" +sum);
		System.out.println("product is :" +prod);
	}
}
