//Sean Gordon, 4/12/17
//the answer is 153
//run-time is .039 seconds
//add d to n, swap, then add new d to new n

package ProjectEuler;

import java.math.BigInteger;

public class Problem57 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
			
	public static void run(){
		
		final int TIMES = 1000;
		BigInteger numerator = BigInteger.valueOf(3);
		BigInteger denominator = BigInteger.valueOf(2);
		int count = 0;
		
		for (int i = 2; i <= TIMES; i++){
			
			numerator = numerator.add(denominator);
			
			BigInteger temp = numerator;
			numerator = denominator;
			denominator = temp;
			
			numerator = numerator.add(denominator);
			
			if (numerator.toString().length() > denominator.toString().length())
				count++;
		}
		
		System.out.println(count);
	}
}
