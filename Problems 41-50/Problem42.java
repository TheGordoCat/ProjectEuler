//Sean Gordon, 3/26/17
//the answer is 162
//run-time is .038 seconds

package ProjectEuler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem42 {

	public static void main(String args[]) throws FileNotFoundException{
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
	
	public static void run() throws FileNotFoundException{
		
		Scanner input = new Scanner(new File("C:/Users/Sean/workspace/ProgrammingByDoing/src/ProjectEuler/problem42.txt")).useDelimiter("[\",]+");
		
		List<Integer> letterSums = new ArrayList<Integer>();
		while (input.hasNext()) {
			letterSums.add(wordScore(input.next()));	
		}
		
		int[] triangleNums = new int[20];
		triangleNums[0] = 1;
		for(int i = 2; i <= triangleNums.length; i++)
			triangleNums[i-1] = triangleNums[i-2] + i;
		
		int count = 0;
		for (int i = 0; i < letterSums.size(); i++)
			for (int j = 0; j < triangleNums.length; j++)
				if (letterSums.get(i) == triangleNums[j])
					count++;
			
		System.out.println(count);
	}
	
	public static int wordScore(String word){
		
		int sum = 0;
		for (int i = 0; i < word.length(); i++)
			sum += word.charAt(i) - 'A' + 1;
		
		return sum;
	}
}
