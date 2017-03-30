//Sean Gordon, 3/29/17
//the answer is 2969/6299/9629
//run-time is .562 seconds

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
			for (int j = i + 1; j < UPPER_LIMIT/3; j++)
				
				if (primes.contains(primes.get(i) + j) && primes.contains(primes.get(i) + 2*j))
					if(isPermutation(primes.get(i), primes.get(i) + j) &&  isPermutation(primes.get(i), primes.get(i) + 2*j)){
						System.out.println(primes.get(i) + "" + (primes.get(i) + j) + "" + (primes.get(i) + 2*j));
						break outerloop;
					}
					
	}
	
	//new method I found of check if permutation
	public static boolean isPermutation(int prime1, int prime2){
		
		int[] nums = new int[10];
		
		while (prime1 > 0){
			nums[prime1 % 10]++;
			prime1 /= 10;
		}
		
		while (prime2 > 0){
			nums[prime2 % 10]--;
			prime2 /= 10;
		}
		
		for (int i = 0; i < nums.length; i++)
			if (nums[i] != 0)
				return false;
		
		return true;
	}
}
