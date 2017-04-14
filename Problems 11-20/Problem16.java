//Sean Gordon, 3/21/17 (updated 4/14/17)
//the answer is 1366
//run-time is .002 seconds

package ProjectEuler;

import java.math.BigInteger;

public class Problem16 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
			
	public static void run(){
		
		final int POWER = 1000;
		
		BigInteger num = BigInteger.valueOf(2);
		num = num.pow(POWER);
		
		String n = num.toString(); 
		System.out.println(sumOfDigits(n));
	}
	
	public static int sumOfDigits(String n){
		
		int sum = 0;
		for (int i = 0; i < n.length(); i++){
			sum += Integer.parseInt(n.charAt(i) + "");
		}
		
		return sum;
	}
}
