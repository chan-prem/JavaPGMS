package tY.practise;

public class RevAStringWithoutLengthM {
	
	public static void main(String[] args) {
		
		String s = "java";
		int count=0;
		char [] ch = s.toCharArray();
		for (char c : ch) {
			count++;
		}
		
		for(int i=count-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
		
	}

}
