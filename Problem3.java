//Sean Gordon, 2/27/17
//improved on 3/1/17
//answer is 6857 for the number 600851475143
//took quite a while to run

package ProjectEuler;
import java.util.Scanner;

public class Problem3 {

	public static void main(String args[]){
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number to find the highest prime for: ");
		final long number = keyboard.nextLong();
		
		long maxPrime = largestPrime(number);
		System.out.println(maxPrime);
		keyboard.close();
	}
	
	
	//finds the largest prime of a number
	public static long largestPrime(long number){
		
		NumberMethods numberMethods = new NumberMethods();
		long maxPrime = 1;
		
		for (long i = 1; i <= number / 2; i++){
			if ((number % i == 0) && numberMethods.isPrime(i) && (i > maxPrime))
				maxPrime = i;
		}
		return maxPrime;
	}
}
