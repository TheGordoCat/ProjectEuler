//Sean Gordon, 2/27/17
//revised on 3/1/17
//the answer to the 10001th prime is 104743

package ProjectEuler;
import java.util.Scanner;

public class Problem7 {

	public static void main(String args[]){
		
		Scanner keyboard = new Scanner(System.in);
		
		NumberMethods numberMethods = new NumberMethods();
		int count = 0;
		long num = 1;
		int nthPrime = 0;
		
		System.out.println("Please enter the nth Prime: ");
		nthPrime = keyboard.nextInt();
		
		while (count != nthPrime){
			num++;
			if (numberMethods.isPrime(num))
				count++;
			
		}
		System.out.println(num);
		keyboard.close();
	}
}
