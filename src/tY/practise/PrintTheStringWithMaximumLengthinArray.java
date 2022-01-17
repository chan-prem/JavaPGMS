package tY.practise;

public class PrintTheStringWithMaximumLengthinArray {

	public static void main(String[] args) {
		
	
	String[] str = {"abc", "hi", "mango", "j", "abcde"};
	String max = str[0]; //mango
	
	for(int i=0; i<str.length; i++)
	{         
		if(max.length()<str[i].length())
		{
			max = str[i];
		}
	}
	System.out.println(max);/*
	
	for(int j=0; j<str.length;j++)
	{
		if(max.length()==str[j].length())
		{
			System.out.print(str[j]+ " ");
		}
	}
*/	}
}
