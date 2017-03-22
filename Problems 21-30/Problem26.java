//Sean Gordon, 3/21/17
//the answer is 983
//Here we use the fact that if 10 is a primitive root mod p, then p-1 is the period

package ProjectEuler;

import java.math.BigInteger;

public class Problem26 {

	public static void main(String args[]){
		
		int maxPeriod = 0;
		
		for (int i = 1; i < 1000; i++){
			if(isTenPrimitiveRoot(i) && (i - 1) > maxPeriod)
				maxPeriod = i - 1;
		}
		System.out.println(maxPeriod + 1);
	}
	
	
	public static boolean isTenPrimitiveRoot(int p){
		
		NumberMethods numberMethods = new NumberMethods();
		
		//find if the number is a prime. Any numbers made of a prime will have a cycle of that prime
		if (!numberMethods.isPrime(p))
			return false;
		
		//remove the primes that are not coprime to 10
		if (p == 2 || p == 5)
			return false;
	
		//check if the order of 10 mod p is less than p-1
		for (int i = 1; i <= (p-1) / 2; i++){
			if(i != 1 && (p-1) % i == 0)
				if ((BigInteger.TEN).pow(i).mod(new BigInteger(p + "")).equals(BigInteger.ONE))
					return false;
		}
	
		return true;
	}
}
