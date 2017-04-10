//Sean Gordon, 2/28/17 (updated 3/23/17 and 4/9/17)
//the answer is 23514624000
//run-time is .034 seconds

package ProjectEuler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Problem8 {
	
	public static void main(String args[]) throws IOException{
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
			
	public static void run() throws FileNotFoundException{
		
		Scanner input = new Scanner(new File("C:/Users/Sean/workspace/ProgrammingByDoing/src/ProjectEuler/problem8.txt"));
		
		String numString = "";
		while(input.hasNext())
			numString = input.next();
		
		final int SUBSTRING_LENGTH = 13;
		long maxValue = 0;
		int begin = 0;
		
		while ((begin + SUBSTRING_LENGTH) < numString.length()){
			long multiple = multipleOfNums(numString.substring(begin, begin + SUBSTRING_LENGTH));
			if (multiple > maxValue)
				maxValue = multiple;
			begin++;
		}
		System.out.println(maxValue);
		
		input.close();
	}
	
		
	public static long multipleOfNums(String num){
		
		long multiple = 1;
		for (int i = 0; i < num.length(); i++){
			multiple *= Long.parseLong(num.charAt(i) + "");
		}
		
		return multiple;
	}
}
