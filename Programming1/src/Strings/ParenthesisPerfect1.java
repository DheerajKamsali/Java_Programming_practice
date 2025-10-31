package Strings;

public class ParenthesisPerfect1 {
	static boolean check(String p) {
		
		char arr[]=p.toCharArray();
		
		char s[]=new char[arr.length];
		int top=-1;
		
		for(int i=0;i<arr.length;i++) {
			char c=arr[i];
			
			if(c== '{' || c=='[' || c=='(' ) {
				
				top++;
				s[top]=c; 
			}
			if(c=='}' && s[top]=='{') {
				top--;
				
			}
			if(c==']' && s[top]=='[') {
				top--;
				
			}
			if(c==')' && s[top]=='(') {
				top--;
			}
		}
			if(top==-1) {
				return true;
			}else {
				return false;
			}
		
	}

	public static void main(String[] args) {
		String input="{[()]}";
		boolean perfect=check(input);
		if(perfect) {
			System.out.println("perefct parenthesis");
		}else {
			System.out.println("not perfect parenthesis");
		}
	}
}
