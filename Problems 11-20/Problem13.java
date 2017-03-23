//Sean Gordon, 3/15/17 (updated 3/21/17)
//the answer is 5537376230

package ProjectEuler;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Problem13 {

	public static void main(String args[]) throws IOException{
	
			Scanner input = new Scanner(new File("problem13.txt"));
			
			List<BigInteger> lines = new ArrayList<BigInteger>();
			while (input.hasNextLine()) {
				lines.add(new BigInteger(input.nextLine()));
			}
			
			BigInteger sum = BigInteger.ZERO;
			for (int i = 0; i < lines.size(); i++)
				sum = sum.add(lines.get(i));
			
			System.out.println(sum.toString().substring(0, 10));
			
			input.close();
	}
}
