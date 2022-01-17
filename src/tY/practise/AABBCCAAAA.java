package tY.practise;

public class AABBCCAAAA {
	public static void main(String[] args) {
		
		String s = "aabbccaa";
		
		for(int i=0; i<s.length()-1;i++)
		{
			int count =1;
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
				System.out.print(count);
				System.out.print(s.charAt(i));
			}
			
		}
	}

}
