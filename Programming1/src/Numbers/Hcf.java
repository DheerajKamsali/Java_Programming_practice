package Numbers;

public class Hcf {
	public static void main(String[] args) {
		
		int a=10 ,b = 20 ,smallest=0 ,hcf=1;
		
		
		if(a<b) {
			
			smallest=a;
		}
		else {
			
			smallest=b;
		}
		for(int i=1; i<=smallest;i++) {
			
			if(a%i==0 && b%i==0) {
				hcf=i;
			}
	
		}
		System.out.println("Hcf : "+hcf);
	}

}
