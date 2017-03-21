//Sean Gordon 3/21/17
//the answer for 100 is 648


package ProjectEuler;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem20 {

	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Enter a num: ");
		num = input.nextInt();
		
		BigInteger n = new BigInteger(num + "");
		String fact = factorial(n).toString(); 
		
		System.out.println(sumOfDigits(fact));
		
		input.close();
	}
	

	public static BigInteger factorial(BigInteger num){
		
		if (num.equals(BigInteger.ZERO) || num.equals(BigInteger.ONE))
			return new BigInteger("1");
		else
			return num.multiply(factorial(num.subtract(new BigInteger("1"))));
	}
	
	
	public static int sumOfDigits(String n){
		
		int sum = 0;
		for (int i = 0; i < n.length(); i++){
			sum += Integer.parseInt(n.charAt(i) + "");
		}
		
		return sum;
	}
}
