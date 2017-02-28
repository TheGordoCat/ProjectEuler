//Sean Gordon, 2/27/17
//answer is 6857 for the number 600851475143
//took quite a while to run

package ProjectEuler;
import java.util.Scanner;

public class Problem3 {

	public static void main(String args[]){
		
		Scanner keyboard = new Scanner(System.in);
		final long number = keyboard.nextLong();
		
		long maxPrime = largestPrime(number);
		System.out.println(maxPrime);
		keyboard.close();
	}
	
	
	//finds the largest prime of a number
	public static long largestPrime(long number){
		
		long maxPrime = 1;
		for (long i = 1; i <= number / 2; i++){
			if (i % 2 != 0 && i % 5 != 0){			//getting rid of some factors so the runtime isn't awful
				if ((number % i == 0) && (phi(i) == i - 1) && (i > maxPrime))
					maxPrime = i;
			}
		}
		return maxPrime;
	}
	
	//finds the amount of numbers coprime to a number
	//if phi(num) = num - 1, then num is a prime
	public static long phi(long num){
		
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
}
