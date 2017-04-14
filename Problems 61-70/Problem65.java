//Sean Gordon, 4/19/17
//the answer is 272
//run-time is .001 seconds

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
		BigInteger denom1 = BigInteger.ONE;
		BigInteger num2 = BigInteger.valueOf(3);
		BigInteger denom2 = BigInteger.ONE;
		
		BigInteger k = BigInteger.valueOf(2);
		for (int i = 3; i <= TIMES; i++){
			
			BigInteger tempNum = num2;
			BigInteger tempDenom = denom2;
			
			if(i % 3 == 0){
				num2 = num1.add(num2.multiply(k));
				denom2 = denom1.add(denom2.multiply(k));
				num1 = tempNum;
				denom1 = tempDenom;
				k = k.add(BigInteger.valueOf(2));
			}
			else{
				num2 = num1.add(num2);
				denom2 = denom1.add(denom2);
				num1 = tempNum;
				denom1 = tempDenom;
			}
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
