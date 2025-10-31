package Strings;

public class RevStrSentenc {
	public static void main(String[] args) {
		
		String sentence="india is my country";
		String words[]=sentence.split(" ");
		
		// printing the array in reverse
		for(int i=words.length-1;i>=0;i--) {
			
			System.out.print(words[i]+" ");
			
		}
	}

}
