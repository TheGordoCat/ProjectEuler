//Sean Gordon, 3/17/20
//the answer is 137846528820

package ProjectEuler;

import java.util.Scanner;
import java.math.BigInteger;

public class Problem15 {

	public static int gridNumber = 0;
	
	public static void main(String args[]){
		
		System.out.println("enter num: ");
		
		Scanner keyboard = new Scanner(System.in);
		gridNumber = keyboard.nextInt();
		BigInteger sum = getPathNums(gridNumber);
		
		System.out.println(sum);
		keyboard.close();
		
	}
	
	public static BigInteger getPathNums(int num){

		BigInteger n = new BigInteger(num + "");
		
		BigInteger totalChoices = factorial(n.multiply(new BigInteger("2")));
		BigInteger repeatingChoices = factorial(n);
		
		BigInteger pathNums = totalChoices.divide(repeatingChoices.multiply(repeatingChoices));
		
		return pathNums;
	}

	public static BigInteger factorial(BigInteger num){
		
		if (num.equals(BigInteger.ZERO) || num.equals(BigInteger.ONE))
			return new BigInteger("1");
		else
			return num.multiply(factorial(num.subtract(new BigInteger("1"))));
	}
}
