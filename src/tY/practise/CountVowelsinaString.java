package tY.practise;

public class CountVowelsinaString {
	public static void main(String[] args) {
	String s = "Happy is a good GUY";
	String s1="aeiou";
	s=s.toLowerCase();
	
	char[] s2 = s1.toCharArray();
	
	for (Character c : s2) {
		int count =0;
		for(int i=0; i<s.length(); i++)
		{
			if(c == s.charAt(i)) {
				count++;
			}
		}
		System.out.println(c+" is present "+count+" times");
		
	}
}
}