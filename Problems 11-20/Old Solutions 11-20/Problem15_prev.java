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
		long sum = getPathNums(gridNumber);
		
		System.out.println(sum);
		keyboard.close();
		
	}
	
	
	public static long getPathNums(int n){

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
	}
}
