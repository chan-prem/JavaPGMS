package tY.practise;

import java.util.LinkedHashSet;

public class Tester {

	public static void main(String[] args) {
	

	String str = "tester";

	LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	for(int i=0;i<str.length(); i++)
	{
		set.add(str.charAt(i));       //tesr
	}
	
	int num = 0;
	for (Character ch : set) {
		/*String s1=ch+ "";
		for(int j=0; j<str.length(); j++)
		{
			String s2=str.charAt(j)+ "";
			if(s1.equals(s2))
			{
				num = j+1;
			}
		}
		system.out.println(ch+" "+num);
		*/
		int ind = str.lastIndexOf(ch);
		System.out.println(ch +" = "+ ind);
	}
}
}
