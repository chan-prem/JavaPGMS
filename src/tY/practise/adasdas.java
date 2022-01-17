package tY.practise;

import java.util.LinkedHashSet;

public class adasdas {
		
	public static void main(String[] args) {
		
		String str = "Testerjava";
		String s = str.toLowerCase(); //testerjava
		int count = 0;

		for(int i=0; i<s.length(); i++)
		{

			for(int j=1; i<s.length(); j++)
			{
				if(s.charAt(i)== s.charAt(j))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(s.charAt(i));
			}
			count =0;
		}
	}
	
}
