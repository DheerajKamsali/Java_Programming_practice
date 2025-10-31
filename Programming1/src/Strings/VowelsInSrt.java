package Strings;

public class VowelsInSrt {
	static void findCount(String s) {
		s=s.toLowerCase(); // or upper 
		int vowelCount=0;
		int consCount=0;
		
		for(int i=0;i<=s.length()-1;i++) {
			char c=s.charAt(i);
			if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u') {
				vowelCount++;
			}else {
				consCount++;
			}
		}
		System.out.println("the no of vowels :"+vowelCount);
		System.out.println("the no of consonants :"+consCount);
	}
	public static void main(String[] args) {
		
		String data="pentagonspace";
		findCount(data);
	}

}
