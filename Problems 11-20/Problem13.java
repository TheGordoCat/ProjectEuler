//Sean Gordon, 3/15/17
//the answer is 5537376230

package ProjectEuler;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Problem13 {

	public static void main(String args[]) throws IOException{
	
			Scanner input = new Scanner(new File("C:/Users/Sean/workspace/ProgrammingByDoing/src/ProjectEuler/problem13.txt"));
			
			List<String> lines = new ArrayList<String>();
			while (input.hasNextLine()) {
				lines.add(input.nextLine());
			}
			
			String[] numArray = lines.toArray(new String[0]);
			long[] nums = new long[numArray.length];
			long[] sums = new long[5];
			
			//sums[0] is where the largest number goes
			for (int i = 0; i < sums.length; i++){
				for (int j = 0; j < numArray.length; j++){
					nums[j] = Long.parseLong(numArray[j].substring(i * 10, (i + 1) * 10));
					sums[i] += nums[j];
				}
			}
			
			//adds the top digits to the next 10 digit number
			for (int i = sums.length - 1; i > 0; i--){
				long remainder = sums[i] / 10000000000L;
				sums[i-1] += remainder;
			}
			
			long firstDigits = sums[0] / 100;
			System.out.println(firstDigits);
			
			input.close();
	}
}
