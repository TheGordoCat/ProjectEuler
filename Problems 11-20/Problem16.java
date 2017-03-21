//Sean Gordon, 3/21/17
//the answer is 1366

package ProjectEuler;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem16 {

	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int power = 0;
		
		System.out.println("Enter a power for 2: ");
		power = input.nextInt();
		
		BigInteger num = new BigInteger("2");
		num = num.pow(power);
		
		String n = num.toString(); 
		System.out.println(sumOfDigits(n));
		
		input.close();
	}
	
	public static int sumOfDigits(String n){
		
		int sum = 0;
		for (int i = 0; i < n.length(); i++){
			sum += Integer.parseInt(n.charAt(i) + "");
		}
		
		return sum;
	}
}
