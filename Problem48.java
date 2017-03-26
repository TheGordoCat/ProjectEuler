//Sean Gordon, 3/25/17
//the answer is 9110846700
//add every value i^i mod 10^10

package ProjectEuler;

import java.math.BigInteger;

public class Problem48 {

	public static void main(String args[]){
		
		BigInteger sum = BigInteger.ZERO;
		for (int i = 1; i <= 1000; i++)
			sum = sum.add(BigInteger.valueOf(i).pow(i)).mod(BigInteger.valueOf(10).pow(10));
		
		System.out.println(sum);
	}
}
