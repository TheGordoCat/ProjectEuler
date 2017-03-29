//Sean Gordon, 3/28/17
//the answer is 5777
//run-time is 1.174 seconds

package ProjectEuler;

public class Problem46 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
	
	public static void run(){
	
		boolean found = false;
		final int LOWER_LIMIT = 33;
		
		for(int i = LOWER_LIMIT; !found; i+=2 )
			if (!hasEquation(i)){
				System.out.println(i);
				found = true;
			}
	}
	
	public static boolean hasEquation(long num){
		
		//eliminates primes and keeps the composites
		NumberMethods numberMethods = new NumberMethods();
		if (numberMethods.isPrime(num))
			return true;
		
		/* We have that num = p + 2s^2 where p is prime and s is a number.
		 * Then num > 2*i*i and num > j */
		for (long i = 1; i*i < num/2; i++)
			for (long j = 2; j < num; j++)
				if (numberMethods.isPrime(j) && num == j + 2*i*i)
					return true;
					
		return false;
	}
}
