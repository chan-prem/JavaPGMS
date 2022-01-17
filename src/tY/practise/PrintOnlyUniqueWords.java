package tY.practise;

import java.util.LinkedHashSet;

public class PrintOnlyUniqueWords {

	public static void main(String[] args) {
		
		String s = "Welcome to bangalore welcome to tyss";
		String str = s.toLowerCase();
		String [] arr = str.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(int i=0; i<arr.length;i++) 
		{
			set.add(arr[i]);
		}
		
		for(String word : set)
		{
			int count = 0;

			for(int i=0; i<arr.length;i++)
			{
				if(word.equals(arr[i])) 
				{
					count++;
				}
			}
			
		
		if(count==1) 
		{
			System.out.print(word+" ");
		}
		}
	}
}
