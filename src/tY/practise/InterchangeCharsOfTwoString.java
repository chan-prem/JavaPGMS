package tY.practise;

public class InterchangeCharsOfTwoString {

	public static void main(String[] args) {
		
		String s = "abc"+"xyz";    //abcxyz
		
		for(int i=0; i<s.length()/2; i++)    //i<3
		{
			String s1 ="" +s.charAt(i) + s.charAt(s.length()/2+i);  
			System.out.print(s1);
			
		}
		
	}
}
