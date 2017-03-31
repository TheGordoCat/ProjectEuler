//Sean Gordon, 3/1/17
//tired of copy paste
//this file will be used to store the methods that calculate different things
package ProjectEuler;

public class NumberMethods {

	
	//simpler, more efficient way to find primes
	public boolean isPrime(long num){
		
		if (num <= 1)
			return false;
		if (num == 2)
			return true;
		if (num % 2 == 0)
			return false;
		
		for (int i = 3; i * i <= num; i += 2)
			if (num % i == 0)
				return false;
		
		return true;
	}
	
	
	//finds the amount of numbers coprime to a number
	//if phi(num) = num - 1, then num is a prime
	public static long phi(long num){
		
		if (num == 1)
			return 1;
		
		long count = 0;
		for(long i = 1; i < num; i++){
			if (hcf(num, i) == 1)
				count++;
		}
		return count;
	}
				
	
	
	//finds the highest common factor of two numbers
	public static long hcf(long integer1, long integer2){
					
		if (integer1 % integer2 == 0)
			return integer2;
		else
			return hcf(integer2, integer1 % integer2);
	}
	
	public int factorial(int num){
		
		if (num == 1 || num == 0)
			return 1;
		else
			return num * factorial(num - 1);
	}
}
