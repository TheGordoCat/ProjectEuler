//Sean Gordon, 3/29/17
//the answer is 1074
//run-time is .031 seconds

package ProjectEuler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem18 {
	
	public static void main(String args[]) throws FileNotFoundException{
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
	
	
	public static void run() throws FileNotFoundException{
	
		Scanner input = new Scanner(new File("problem18.txt"));
		int[][] triangle = new int[15][15];
		
		for (int i = 0; i < triangle.length; i++)
			for (int j = 0; j <= i; j++)
				triangle[i][j] = input.nextInt();
			
		for (int i = triangle.length-2; i >= 0; i--)
			for (int j = 0; j <= i; j++)
				triangle[i][j] += Math.max(triangle[i+1][j], triangle[i+1][j+1]);
		
		System.out.println(triangle[0][0]);
	}
}
