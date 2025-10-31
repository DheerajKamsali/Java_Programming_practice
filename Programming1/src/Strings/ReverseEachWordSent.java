package Strings;

public class ReverseEachWordSent {
	public static void main(String[] args) {
		
		String sentence="india is my country";
		// trying to split and create array
		String words[]=sentence.split(" ");
		//traversing array
		for(int i=0;i<words.length;i++) {
			//fetching element from array
			String word=words[i];
			//traversing threough last to fisrt
			for(int j=word.length()-1;j>=0;j--) {
				//printing char at position
				System.out.print(word.charAt(j));
			}
			System.out.print(" ");
		}
	}

}
