//Sean Gordon, 3/21/17 (updated 4/15/17)
//the answer for 1000 is 4782
//run-time is .232 seconds
//make an arraylist where we add a new value equal to the sum of the previous two

package ProjectEuler;

import java.math.BigInteger;
import java.util.ArrayList;

public class Problem25 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
			
	public static void run(){
		
		boolean found = false;
		int index = 2;
		ArrayList<BigInteger> list = new ArrayList<BigInteger>();
		
		list.add(BigInteger.ONE);
		list.add(BigInteger.ONE);
		
		while (!found){
			
			list.add(list.get(index - 2).add(list.get(index - 1)));
			
			int numLength = list.get(index).toString().length();
			if (numLength == 1000)
				found = true;
			else 
				index++;
		}
		
		System.out.println(index + 1);
	}
}
