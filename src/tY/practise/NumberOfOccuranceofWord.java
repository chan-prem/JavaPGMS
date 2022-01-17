package tY.practise;

import java.util.LinkedHashSet;

public class NumberOfOccuranceofWord {
	
	public static void main(String[] args) {
		
		String str = "Welcome to tyss welcome to to to";
		String s = str.toLowerCase();
		
		String[] arr = s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();

		for(int i=0; i<arr.length; i++) {
			
			set.add(arr[i]);		
		}
		
		for (String st : set) {
			
			int count =0;
			for(int i =0; i<arr.length;i++) {
				if(st.equals(arr[i])) {
					count++;
				}
			}
			System.out.println(st+"="+count);
		}
		
		
	}
}
	


