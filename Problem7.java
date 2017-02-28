//Sean Gordon, 2/27/17
//the answer is 104743

package ProjectEuler;
import java.util.Scanner;

public class Problem7 {

	public static void main(String args[]){
		
		Scanner keyboard = new Scanner(System.in);
		
		int count = 0;
		long num = 1;
		int nthPrime = 0;
		
		nthPrime = keyboard.nextInt();
		while (count != nthPrime){
			num++;
			if (phi(num) == num - 1)
				count++;
			
		}
		System.out.println(num);
		keyboard.close();
	}
	
	
	//functions copied from Problem3
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
