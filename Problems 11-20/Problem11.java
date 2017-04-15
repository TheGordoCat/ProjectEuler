//Sean Gordon, 3/15/17 (updated 4/7/17)
//the answer is 70600674
//run-time is .028 seconds


package ProjectEuler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem11 {
	
	private static int max = 0;
	
	public static void main(String args[]) throws FileNotFoundException{
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
		
	public static void run() throws FileNotFoundException{
		
		Scanner input = new Scanner(new File("problem11.txt"));
		
		int[][] numArray = new int[20][20];
		for (int i = 0; i < numArray.length; i++)
			for (int j = 0; j < numArray[0].length; j++)
				numArray[i][j] = input.nextInt();
		                               
		
		for (int i = 0; i < numArray.length; i++){
			for (int j = 0; j < numArray[0].length; j++){
				
				//for left to right
				if (j + 3 < numArray[0].length)
					maxProduct(numArray[i][j], numArray[i][j+1], numArray[i][j+2], numArray[i][j+3]);
				
				//up to down
				if (i + 3 < numArray.length)
					maxProduct(numArray[i][j], numArray[i+1][j], numArray[i+2][j], numArray[i+3][j]);
				
				//diagonally right and down
				if (i + 3 < numArray.length && j + 3 < numArray[0].length)
					maxProduct(numArray[i][j], numArray[i+1][j+1], numArray[i+2][j+2], numArray[i+3][j+3]);
				
				//diagonally left and down
				if (i + 3 < numArray.length && j - 3 >= 0)
					maxProduct(numArray[i][j], numArray[i+1][j-1], numArray[i+2][j-2], numArray[i+3][j-3]);
			}
		}
		System.out.println(max);
		input.close();
	}
	
	
	public static void maxProduct(int a, int b, int c, int d){
		
		int product = a * b * c * d;
		if (product > max)
			max = product;
	}
}
