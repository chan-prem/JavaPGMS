package tY.practise;

public class PrintTheStringWithLeastLengthinArray {

	public static void main(String[] args) {
		
	
	String[] str = {"abc", "hi", "mango", "j", "tyss", "abcde", "l", "k"};
	String min = str[0];
	for(int i=0; i<str.length; i++)
	{
		if(min.length()<str[i].length())
		{
			min = str[i];
		}
	}
	for(int j=0; j<str.length;j++)
	{
		if(min.length()==str[j].length())
		{
			System.out.print(str[j]+ " ");
		}
	}
	}
}
