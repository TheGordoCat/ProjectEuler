//Sean Gordon, 4/19/17
//the answer is 272
//run-time is .001 seconds
//we only care about the numerator and the numerator does not depend on the denominator

package ProjectEuler;

import java.math.BigInteger;

public class Problem65 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
			
	public static void run(){
		
		final int TIMES = 100;
		BigInteger num1 = BigInteger.valueOf(2);
		BigInteger num2 = BigInteger.valueOf(3);
		
		for (int i = 3; i <= TIMES; i++){
			
			BigInteger tempNum = num2;
			if(i % 3 == 0)
				num2 = num1.add(num2.multiply(BigInteger.valueOf(2*i/3)));
			else
				num2 = num1.add(num2);	
			
			num1 = tempNum;
		}
		
		System.out.println(sumOfDigits(num2));
	}
	

	public static long sumOfDigits(BigInteger n){
		
		String num = n.toString();
		long sum = 0;
				
		for (int i = 0; i < num.length(); i++)
			sum += Long.parseLong(num.charAt(i) + "");
		
		return sum;
	}
}
