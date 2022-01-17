package tY.practise;

import java.util.LinkedHashSet;

public class PrintOnlyDuplicateWords {
	
	public static void main(String[] args) {
		
		String str = "Welcome to welcome to bangalore tyss";
		String s = str.toLowerCase();

		String [] arr = s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(int i=0; i<arr.length; i++) {
			set.add(arr[i]);
			}
		
		for (String word : set) {
			int count = 0;
			
			for(int i=0; i<arr.length;i++) {
				if(word.equals(arr[i])) {
					count++;
				}
			}
			
		if(count>1) {
			System.out.print(word+"="+count+",");
			}
		}
	
	}

}
