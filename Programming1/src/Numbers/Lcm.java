package Numbers;

public class Lcm {

	static void lcm(int a,int b) {
	    int  great=0;
		
		if(a>b) {
			great=a;
		}else {
			great=b;
		}
		for(int i=great;i<=a*b;i++) {
			if(i%a==0 && i%b==0) { // for getting commom multiple
				System.out.println(i);
				break;
			}	 
          }
	}
	
	public static void main(String[] args) {
		int a=2;
		int b=4;
		lcm(a,b);
	}
}