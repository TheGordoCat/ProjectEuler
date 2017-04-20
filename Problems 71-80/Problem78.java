//Sean Gordon, 4/20/17 lmao
//the answer is 55374
//run-time is 3.287 seconds

package ProjectEuler;

import java.math.BigInteger;
import java.util.ArrayList;

public class Problem78 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
		
	public static void run(){
		
		ArrayList<BigInteger> probabilities = new ArrayList<BigInteger>();
		boolean found = false;
		
		probabilities.add(BigInteger.ONE);
		
		for (int i = 1; !found; i++){
			
			BigInteger sum = BigInteger.ZERO;
			int penta = 0;
			
			for (int j = 1; penta <= i ; j++){	
				
				penta = j*(3*j - 1)/2;
				if (penta <= i)
					sum = sum.add(BigInteger.valueOf((int)(Math.pow(-1, j-1))).multiply(probabilities.get(i - penta)));
				
				penta = (-1)*j*((-1)*3*j - 1)/2;
				if (penta <= i)
					sum = sum.add(BigInteger.valueOf((int)(Math.pow(-1, j-1))).multiply(probabilities.get(i - penta)));
			}
			
			probabilities.add(sum);
			if (sum.mod(BigInteger.valueOf(1000000)).equals(BigInteger.ZERO)){
				found = true;
				System.out.println(i);
			}
		}
	}
}
