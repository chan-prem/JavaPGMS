package tY.practise;

import java.util.LinkedHashSet;

public class NumberofOccOfEachChar {

	
	public static void main(String[] args) {
		
		String s = "java";
		//Step 1: Create any SET Collection and add all the character of given String into set.
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i = 0; i<s.length(); i++)// 0<4 // 1<4 // 2<4 // 3<4 // 4<4
		{
			set.add(s.charAt(i));        // j   // a   // v   // duplicate a 
 		}
		System.out.println(set);         // j  a  v
		//Step2: Compare each char of Set with all the Character of given String.
		
		for (Character ch : set) {       // set = {j, a, v}
			//ch = j, //ch =a 
			int count =0;               // 0->1// 0->1//1->2

			for(int i =0; i<s.length(); i++){      // 0<4 // 1<4 //2<4 //3<4//4<4
				if(ch == s.charAt(i))	{          // a==j //a==a//a==v//a==a
		//Step3: If character matches, increase the count.
					count++;                       
				}
			}		
		//Step 4: Print both Character of Set and Count.
			System.out.println(ch + "="+count); // j = 1  // a = 2 //
			
		}
		
	}
}
