//Sean Gordon, 3/22/17 (updated 4/15/17)
//the answer is 871198282
//run-time is .064 seconds

package ProjectEuler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem22 {

	public static void main(String args[]) throws IOException{
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
	
	public static void run() throws FileNotFoundException{
		
		Scanner input = new Scanner(new File("problem22.txt")).useDelimiter("[\",]+");
		
		List<String> names = new ArrayList<String>();
		while (input.hasNext()) {
			names.add(input.next());	
		}
	
		Collections.sort(names);
		
		long sum = 0;
		for (int i = 0; i < names.size(); i++)
			sum += getLetterScore(names.get(i)) * (i+1);
		
		System.out.println(sum);
		input.close();
	}
	
	
	public static int getLetterScore(String name){
		
		int letterScore = 0;
		for (int i = 0; i < name.length(); i++)
			letterScore += name.charAt(i) - 64;
		
		return letterScore;
	}
}
