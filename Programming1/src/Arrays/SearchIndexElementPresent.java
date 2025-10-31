package Arrays;

public class SearchIndexElementPresent {
//	static int findindex(int se,int a[]) {
//		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==se) {
//				return i;
//			}
//		}
//		return -1;
//	}
	
	static String findindex(int se,int a[]) {
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==se) {
				return "element found at index "+i;
			}
		}
		return "element not found";
	}
	public static void main(String[] args) {
		int a[]= {34,57,76,87,90,23};
		int se=76;
//		int res=findindex(se, a);
//		if(res>0) {
//			System.out.println("element found at : "+res);
//		}else {
//			System.out.println("element not found");
//		}
		
		String res=findindex(se, a);
		System.out.println(res);	
	}	

}
