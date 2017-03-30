//Sean Gordon, 3/29/17
//the answer is 2969/6299/9629
//run-time is .078 seconds

package ProjectEuler;

import java.util.ArrayList;

public class Problem49 {


	public static void main(String args[]){
			
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
		
		
	public static void run(){
			
		NumberMethods numberMethods = new NumberMethods();
		ArrayList<Integer> primes = new ArrayList<Integer>();
		final int LOWER_LIMIT = 1489;
		final int UPPER_LIMIT = 10000;
		
		for (int i = LOWER_LIMIT; i < UPPER_LIMIT; i+=2)
			if(numberMethods.isPrime(i))
				primes.add(i);
		
		outerloop:
		for (int i = 0; i < primes.size(); i++)
			for (int j = i + 1; j < primes.size(); j++)
				if(isPermutation(primes.get(i), primes.get(j))){
					
					int difference = primes.get(j) - primes.get(i);
					if (primes.contains(primes.get(j) + difference) && isPermutation(primes.get(i), primes.get(j) + difference)){
						System.out.println(primes.get(i) + primes.get(j) + (primes.get(j) + difference));
						break outerloop;
					}
				}
	}
	
	
	public static boolean isPermutation(int prime1, int prime2){
		
		String num1 = prime1 + "";
		String num2 = prime2 + "";
		
		for (int i = 0; i < num1.length(); i++)
			if (!num1.contains(num2.charAt(i) + "") || !num2.contains(num1.charAt(i) + ""))
				return false;
		
		return true;
	}
}
