//Sean Gordon, 2/27/17
//improved on 3/1/17 and 3/24/17
//answer is 6857 for the number 600851475143

package ProjectEuler;

public class Problem3 {

	public static void main(String args[]){
		
		final long NUMBER = 600851475143L;
		long maxPrime = largestPrime(NUMBER);
		System.out.println(maxPrime);
	}
	
	
	public static long largestPrime(long number){
		
		NumberMethods numberMethods = new NumberMethods();
		long maxPrime = 1;
		
		for (long i = 1; i*i <= number; i++){
			if ((number % i == 0) && numberMethods.isPrime(i) && (i > maxPrime))
				maxPrime = i;
		}
		return maxPrime;
	}
}
