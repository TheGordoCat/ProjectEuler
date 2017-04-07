//Sean Gordon, 3/17/20 (updated 4/6/17)
//the answer is 137846528820
//run-time is 9.626x10^-4 seconds

package ProjectEuler;

import java.math.BigInteger;

public class Problem15 {
	
	public static void main(String args[]){
		
		long start = System.nanoTime();
		run();
		long end = System.nanoTime();
		System.out.println((double) (end - start) / 1000000000 + " seconds");
	}
	
	public static void run(){
		
		final int GRID_NUMBER = 20;
		BigInteger sum = getPathNums(GRID_NUMBER);
		System.out.println(sum);
		
	}
	
	public static BigInteger getPathNums(int num){

		BigInteger totalChoices = factorial(2*num);
		BigInteger repeatingChoices = factorial(num);
		
		BigInteger pathNums = totalChoices.divide(repeatingChoices.multiply(repeatingChoices));
		
		return pathNums;
	}

	public static BigInteger factorial(int num){
		
		if (num == 0 || num == 1)
			return BigInteger.ONE;
		else
			return BigInteger.valueOf(num).multiply(factorial(num-1));
	}
}
