package tY.practise;

public class ReverseEachWordandString {

	
	public static void main(String[] args) {
		
		String s = "Welcome to tyss";
		String[] str = s.split(" ");
		
		
		for(int i=0; i<str.length; i++)
		{

			String rev ="";

			for(int j=str[i].length()-1; j>=0; j--)
			{
				rev = rev + str[i].charAt(j);
				
			}
			System.out.print(rev+" ");
 		}
		
		
	
	}
}
