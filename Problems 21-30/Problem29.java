//Sean Gordon, 3/24/17
//the answer is 9183

package ProjectEuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Problem29 {

	public static void main(String args[]){
		
		final int LIMIT = 100;
		ArrayList<BigInteger> nums = new ArrayList<BigInteger>();
		
		for (int a = 2; a <= LIMIT; a++)
			for (int b = 2; b <= LIMIT; b++)
				nums.add(BigInteger.valueOf(a).pow(b));
			
		Set<BigInteger> powers = new LinkedHashSet<>(nums);
		long count = powers.size();
		
		System.out.println(count);
	}
}
