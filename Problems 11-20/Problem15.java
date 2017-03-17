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

		String number = num + ""; 
		BigInteger n = new BigInteger(number);
		
		BigInteger totalChoices = factorial(n.multiply(new BigInteger("2")));
		BigInteger repeatingChoices = factorial(n);
		
		BigInteger pathNums = totalChoices.divide(repeatingChoices.multiply(repeatingChoices));
		
		return pathNums;
	}

	public static BigInteger factorial(BigInteger num){
		
		String number = num + "";
		BigInteger n = new BigInteger(number);
		
		if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE))
			return new BigInteger("1");
		else
			return n.multiply(factorial(n.subtract(new BigInteger("1"))));
	}
	
	
	
	//this algorithm actually works lmao
	//this was my first solution, but I forgot about the choose function
	/*public static long getPathNums(int n){

		long numArray[] = new long[n];
		long sum = 1;
		int count = 0;
		long arraySum = 0;
		
		for (int i = 0; i < n; i++){
			numArray[i] = 1;
			sum += numArray[i];
		}
		
		while (count < n - 2){
			
			for (int i = n-1; i >= 0; i--){
				for (int j = 0; j <= i; j++){
					
					arraySum += numArray[j];
				}
				
				numArray[i] = arraySum;
				arraySum = 0;
				sum += numArray[i];
			}
			count++;
		}
		
		return sum * 2;
	}*/
}
