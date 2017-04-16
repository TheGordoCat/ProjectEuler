//Sean Gordon, 4/16/17
//the answer is 8319823
//run-time is .141 seconds

//the goal is to maximize phi of n, but n cannot be a prime because primes cannot have the permutation
//so n must be of two prime numbers that fit around sqrt of 10^7

package ProjectEuler;

public class Problem70 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
		
	public static void run(){
		
		final int LIMIT = 10000;
		NumberMethods numberMethods = new NumberMethods();
		double min = Double.MAX_VALUE;
		int n = 0;
		
		int[] phiOf = new int[LIMIT + 1];
		for (int i = 1; i <= LIMIT; i++)
			if (numberMethods.isPrime(i))
				phiOf[i] = i - 1;

		
		for (int i = 1; i*i <= LIMIT*1000; i+=2)
			for (int j = i; j <= LIMIT; j+=2){
				
				int phiOfIJ = phiOf[i] * phiOf[j];
				if(i*j < LIMIT*1000 && isPermutation(i*j, phiOfIJ) && (double)(i*j)/phiOfIJ < min){
					min = (double) (i*j)/phiOfIJ;
					n = i*j;
				}
			}
		
		System.out.println(n);
	}
	
	
	public static boolean isPermutation(int n1, int n2){
		
		int[] numbers = new int[10];
		
		while(n1 > 0){
			numbers[n1 % 10]++;
			n1 /= 10;
		}
		
		while(n2 > 0){
			numbers[n2 % 10]--;
			n2 /= 10;
		}
		
		for (int i = 0; i < numbers.length; i++)
			if (numbers[i] != 0)
				return false;
		
		return true;
	}
}
