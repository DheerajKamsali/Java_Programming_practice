package Numbers;

public class Prime {
	
	static boolean isPrime(int num) {
		
		for(int i=2;i<= Math.sqrt(num)+1;i++) { // to reduce complexity we can use n/2 or sqrt num or sqrt num +1
			if(num%i==0) { // to know if it have factors or not
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		 boolean res=isPrime(4);
		 System.out.println(res);
	}

}
