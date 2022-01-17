package tY.practise;

public class ReverseEachWordofGivenString {
	
	
	public static void main(String[] args) {
		
		String s ="Welcome to Tyss company";
		String[] str = s.split(" ");
		
		String rev = "";
		
		for(int i=str.length-1; i>=0; i--)
		{
			rev = rev+str[i]+ " ";
			
		}
		System.out.println(rev);
	
	}

}
