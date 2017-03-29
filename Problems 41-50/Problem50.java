//Sean Gordon, 3/29/17
//the answer is 997651
//run-time is 118.794 seconds

package ProjectEuler;

import java.util.ArrayList;

public class Problem50 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
	
	
	public static void run(){
		
		NumberMethods numberMethods = new NumberMethods();
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		final int LIMIT = 1000000;
		
		for (int i = 3; i < LIMIT; i+=2)
			if(numberMethods.isPrime(i))
				primes.add(i);
		
		int maxPrime = 0;
		int maxCount = 0;
		
		for (int i = 0; i < primes.size(); i++)
			for(int j = 0; j < primes.size()/2; j++){
				
				int count = 0;
				int sum = 0;
				for(int k = j; sum <= primes.get(i); k++){
					
					sum += primes.get(k);
					count++;
					if (sum == primes.get(i) && count > maxCount){
						maxCount = count;
						maxPrime = primes.get(i);
						System.out.println(maxPrime);
					}
				}
			}
		
		System.out.println(maxPrime);
		
	}
}
