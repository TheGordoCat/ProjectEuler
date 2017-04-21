//Sean Gordon, 4/20/17 lmao
//the answer is 190569291
//run-time is .003 seconds
//use Euler's partition theorem using the generalized pentagons

package ProjectEuler;

import java.math.BigInteger;
import java.util.ArrayList;

public class Problem76 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
		
	public static void run(){
		
		ArrayList<BigInteger> probabilities = new ArrayList<BigInteger>();
		probabilities.add(BigInteger.ONE);
		
		for (int i = 1; i <= 100; i++){
			
			BigInteger sum = BigInteger.ZERO;
			int penta = 0;
			
			for (int j = 1; penta <= i ; j++){	
				
				BigInteger sign = BigInteger.valueOf((int)(Math.pow(-1, j-1)));
				penta = j*(3*j - 1)/2;
				
				if (penta <= i)
					sum = sum.add(sign.multiply(probabilities.get(i - penta)));
				
				penta = (-1)*j*((-1)*3*j - 1)/2;
				if (penta <= i)
					sum = sum.add(sign.multiply(probabilities.get(i - penta)));
			}
			
			probabilities.add(sum);
		}
		
		System.out.println(probabilities.get(100).subtract(BigInteger.ONE));
	}
}
