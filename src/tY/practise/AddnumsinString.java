package tY.practise;

public class AddnumsinString {
	public static void main(String[] args) {
	String s = "a1$3b23";
	int sum = 0;
	for (int i = 0; i<s.length(); i++)
	{
		
		if(s.charAt(i)>='0' && s.charAt(i)<='9') {
			
			sum = s.charAt(i)-48 + sum;
		}
		}
		System.out.println(sum);
	
	}

}
