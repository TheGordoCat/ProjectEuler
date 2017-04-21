//Sean Gordon, 4/21/17
//the answer is 427337
//run-time is .039 seconds

package ProjectEuler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem81 {

	public static void main(String args[]) throws FileNotFoundException{
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
		
	public static void run() throws FileNotFoundException{
		
		Scanner input = new Scanner(new File("C:/Users/Sean/workspace/ProgrammingByDoing/src/ProjectEuler/problem81.txt"));
		
		int[][] matrix = new int[80][80];
		for (int i = 0; i < matrix.length; i++){
			
			String[] line = input.nextLine().split(",");
			for (int j = 0; j < matrix[0].length; j++)
				matrix[i][j] = Integer.parseInt(line[j]);
		}
		
		//first we do the bottom right triangle beginning with the left hand side and going down the diagonals
		for (int i = matrix.length-2; i >= 0; i--){
			
			int rows = i;
			int cols = matrix[0].length-1;
			for (int j = 0; j < matrix.length-i; j++){
			
				if (rows+1 >= matrix.length)
					matrix[rows][cols] += matrix[rows][cols+1];
				else if (cols+1 >= matrix[0].length)
					matrix[rows][cols] += matrix[rows+1][cols];
				else
					matrix[rows][cols] += Math.min(matrix[rows+1][cols], matrix[rows][cols+1]);
				
				rows++;
				cols--;
			}
		}
		
		//now we do the upper left triangle starting on the top row and going down the diagonals
		for (int j = matrix[0].length-2; j >= 0; j--){
			
			int rows = 0;
			int cols = j;
			for (int k = 0; k < j+1; k++){
			
				matrix[rows][cols] += Math.min(matrix[rows+1][cols], matrix[rows][cols+1]);
				rows++;
				cols--;
			}
		}
		
		System.out.println(matrix[0][0]);
		input.close();
	}
		
}
