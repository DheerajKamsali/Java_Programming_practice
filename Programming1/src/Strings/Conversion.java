package Strings;

public class Conversion {
	
	static String toggle(String input) {
		String result="";
		
		for(int i=0;i<input.length();i++) {
			
			char ch=input.charAt(i);
			
			if(ch>='A' && ch<='Z') {
				
				result=result+(char)(ch+32);
			}else if(ch>='a' && ch<='z') {
				result =result+(char)(ch-32);
			}else {
				
				result=result+ch; //to give spaces  imppppp
			}
		}
		return result;
	}
	public static void main(String[] args) {
		String value="jAvA PrOgrAmMiNg";
		
		System.out.println(toggle(value));
	}

}
