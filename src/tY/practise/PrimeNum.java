package tY.practise;

public class PrimeNum {
//Print all prime numbers upto 100
/*	public static void main(String[] args) {
		
		for(int i = 2; i<=100; i++)
		{		int count = 0;

			for(int j=1; j<=i; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+" ");
			}
		}
	}*/
	
	//Print first 10 Prime numbers
	
/*	public static void main(String[] args) {
		int num = 1;
		int countuntil = 0;
		
		while(countuntil<=10)
		{
			int count =0;
			for(int i =1; i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(num+" ");
				countuntil++;
			}
			num++;
		}
	}*/
	
	public static void main(String[] args) {
		int num = 17;
		int count =0;
		
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(num +" is Prime");
		}else {
			System.out.println(num+ " is not Prime");
		}
	}
}
