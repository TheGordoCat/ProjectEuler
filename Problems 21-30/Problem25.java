//Sean Gordon, 3/21/17
//the answer for 1000 is 4782
//make an arraylist where we add a new value equal to the sum of the previous two

package ProjectEuler;

import java.math.BigInteger;
import java.util.ArrayList;

public class Problem25 {

	public static void main(String args[]){
		
		boolean found = false;
		int index = 2;
		ArrayList<BigInteger> list = new ArrayList<BigInteger>();
		
		list.add(BigInteger.ONE);
		list.add(BigInteger.ONE);
		
		while (!found){
			
			list.add(list.get(index - 2).add(list.get(index - 1)));
			
			String num = list.get(index).toString();
			if (num.length() == 1000)
				found = true;
			else 
				index++;
		}
		
		System.out.println(index + 1);
	}
}
