package Numbers;

public class AmsWoBuilt {
	
	static int power(int base,int power) {
//		
//		int res=1;
//		while(power!=0) {
//		res=base*res; // ex power 2 later one later 0
//		power--;
		
		// another logic
		int res=1;
		for(int i=1;i<=power;i++) {  // another logic for(int i=pow; i>=1;i--) 
			//res=base*res;            // res*=base;
			res *=base;
	   }
     return res;
   }
	
	static int findCount(int num) {
		
		int count=0;
		while(num!=0) {
          num=num/10;
          count++;
		}
		return count;
	}
	
	static int findAs(int num) {
		int res=0;
		int dig=findCount(num);
		while(num!=0) {
		    int rem=num%10;
		    res=power(rem,dig)+res;
		    num=num/10;
		}
		return res;
	}
	
	public static void main(String[] args) {
		//int num=153;
		for(int i=1;i<=10000;i++) {
			int num=i;
		int res=findAs(num);
		if(num==res) {
			System.out.println(num);
		}
//		}else {
//			System.out.println("not an amstrong number");
//		  }
		} 
	} 
}