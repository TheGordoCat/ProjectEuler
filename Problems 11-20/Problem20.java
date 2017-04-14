//Sean Gordon 3/21/17 (4/14/17)
//the answer for 100 is 648
//run-time is .001 seconds

package ProjectEuler;

import java.math.BigInteger;

public class Problem20 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
			
	public static void run(){
		
		final int NUM = 100;
		
		BigInteger fact = BigInteger.ONE;
		for (int i = 1; i <= NUM; i++)
			fact = fact.multiply(BigInteger.valueOf(i)); 
		
		System.out.println(sumOfDigits(fact.toString()));
	}
	
	
	public static int sumOfDigits(String n){
		
		int sum = 0;
		for (int i = 0; i < n.length(); i++){
			sum += Integer.parseInt(n.charAt(i) + "");
		}
		
		return sum;
	}
}
