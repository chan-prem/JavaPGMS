package tY.practise;

public class FindMissingElementinArray {
public static void main(String[] args) {
	int [] s = {1,3,4,5};
	int totalEle = s.length+1; //5
	
	int expectedSum = totalEle * ((totalEle+1)/2);//15
	int actualSum = 0;
	for (int i : s) {
		actualSum = actualSum+i; //13
	}
	System.out.println(expectedSum-actualSum); //15-13=2
	
}
}
