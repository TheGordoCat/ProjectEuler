//Sean Gordon, 4/6/17
//the answer is 972
//run-time is .109 seconds

package ProjectEuler;

import java.math.BigInteger;

public class Problem56 {

public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
		
		
	public static void run(){
		
		int max = 0;
		final int LIMIT = 100;
		
		for (int a = 1; a < LIMIT; a++)
			for (int b = 1; b < LIMIT; b++){
				
				BigInteger num = BigInteger.valueOf(a).pow(b);
				int sum = sumOfDigits(num);
				if (sum > max)
					max = sum;
			}
		
		System.out.println(max);
	}
	
	public static int sumOfDigits(BigInteger n){
		
		int sum = 0;
		String num = n.toString();
		
		for (int i = 0; i < num.length(); i++)
			sum += Integer.parseInt(num.charAt(i) + "");
		
		return sum;
	}
}
