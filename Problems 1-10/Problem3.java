//Sean Gordon, 2/27/17
//improved on 3/1/17, 3/24/17, and 4/7/17
//answer is 6857 for the number 600851475143
//run-time is .011 seconds

package ProjectEuler;

public class Problem3 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
		
	final static long NUMBER = 600851475143L;
	
	public static void run(){
		
		long maxPrime = largestPrime(NUMBER);
		System.out.println(maxPrime);
	}
	
	public static long largestPrime(long number){
		
		NumberMethods numberMethods = new NumberMethods();
		long maxPrime = 1;
		
		for (long i = 1; i*i <= number; i++){
			
			if ((number % i == 0) && numberMethods.isPrime(NUMBER/i) && (i > maxPrime)){
				maxPrime = i;
				break;
			}
			if ((number % i == 0) && numberMethods.isPrime(i) && (i > maxPrime))
				maxPrime = i;
		}
		
		return maxPrime;
	}
}
