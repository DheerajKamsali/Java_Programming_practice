package Numbers;

public class AmstrongNum {
	
	static int findCount(int num) {
		int count=0;
		
		while(num!=0) {

			num=num/10;
			count++;
		}
		return count;
	}
	
	static int findAs(int num) {
		int dig=findCount(num);
		int res=0;
		while(num!=0) {
			int rem=num%10;
			
			res=(int)Math.pow(rem,dig)+res; // to add all power values
			num=num/10;
		}
		return res;
	}
	
public static void main(String[] args) {
		
		int num=169;
		
		int res=findAs(num);
		if(num==res) {
			System.out.println("Amstrong number");
	}else {
		System.out.println("Not an amstrong number");
	   }	
		
	}

}
