package tY.practise;

public class FibonacciNums {

	
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int num = 15;
		
		
		if(num==1) {
			System.out.println(a);
		}else if(num>1){
			System.out.print(a+" "+b);
		}
		for(int i=2; i<num; i++) {
		int	c = a+b;
		
		System.out.print(" "+c);
		a=b;
		b=c;		
		}
	}
}
//Print upto 50