package Strings;

import java.util.Arrays;

public class SplitStrConArr {
	
	public static void main(String[] args) {
		String sentence="India is my country";
		String word="country";
		
		// split by spaces and it returns String arrays
		
		String arr[]=sentence.split(" "); // split by space
		boolean found=false;
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i].equals(word)) {
				found =true;
			     break;
			}
		}
		if(found) {
			System.out.println(word +" found in the sentence");
		}else {
			System.out.println(word+" not found in sentence");
		}
		
	}

}
