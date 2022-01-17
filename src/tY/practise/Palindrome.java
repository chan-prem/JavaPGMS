package tY.practise;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int num = 12312;
		int temp = num;
		int rev = 0;
		
		while(temp!=0) {
			int rem = temp%10;
			rev = rev*10 + rem;
			temp = temp/10;
		}
		
		if(rev==num) {
		System.out.println(rev+" is Palindrome");
		}else {
			System.out.println(rev+" is not Palindrome");
		}
		
	}
}
