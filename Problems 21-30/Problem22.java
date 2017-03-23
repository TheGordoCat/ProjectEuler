//Sean Gordon, 3/22/17
//the answer is 871198282

package ProjectEuler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem22 {

	public static void main(String args[]) throws IOException{
		
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
			letterScore += letterNum(name.charAt(i));
		
		return letterScore;
	}
	
	
	public static int letterNum(char letter){
		
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		for (int i = 0; i < alphabet.length; i++)
			if (letter == Character.toUpperCase(alphabet[i]))
				return i + 1;
		
		return 0;
	}
}
