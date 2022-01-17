package tY.practise;

public class New {

	
	public static void main(String[] args) {
		
		String s = "stone";
		
		for(int i=0; i<s.length(); i++)
		{
			if(i==0) 
			{
		/*		String s1= ""+ s.charAt(i);
				System.out.print(s1.toUpperCase());
		*/
				char ch = (char)(s.charAt(i)-32);
				System.out.print(ch);
			}else {

				System.out.print(s.charAt(i));
				
				}
			}
		
	}
}
