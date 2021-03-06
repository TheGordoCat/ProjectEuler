//Sean Gordon, 4/6/17
//the answer is 4075
//run-time is .012 seconds

//once r crosses the halfway mark of n, the values repeat
//this only increases the run-time by 4 milliseconds compared to brute force though.

package ProjectEuler;

import java.math.BigInteger;

public class Problem53 {

	public static void main(String args[]){
			
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
			
	public static void run(){
				
		long count = 0;
		final int LIMIT = 100;
		
		BigInteger[] factorials = new BigInteger[LIMIT + 1];
		for (int i = 0; i <= LIMIT; i++)
			factorials[i] = factorial(i);
		
		for (int n = 23; n <= LIMIT; n++)
			for (int r = 0; r <= n/2; r++){
				
				BigInteger choose = factorials[n].divide(factorials[r].multiply(factorials[n-r]));
				if (n % 2 == 0 && r == n/2 && choose.compareTo(BigInteger.valueOf(1000000)) > 0)
					count++;
				else if (choose.compareTo(BigInteger.valueOf(1000000)) > 0)
					count+=2;
			}
		
		System.out.println(count);
				
	}
			

	public static BigInteger factorial(int num){
				
		if (num == 0 || num == 1)
			return BigInteger.ONE;
		else
			return BigInteger.valueOf(num).multiply(factorial(num-1));
	}
}
