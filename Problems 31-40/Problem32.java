//Sean Gordon, 3/27/17
//the answer is 45228
//run-time is .031 seconds

package ProjectEuler;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Problem32 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
	
	
	public static void run(){
		
		ArrayList<Integer> products = new ArrayList<Integer>();
		
		for (int i = 1; i < 10; i++)
			for (int j = 1000; j < 10000; j++)
				if (i*j < 10000 && isPandigital(i, j, i*j))
					products.add(i*j);
				
		
		for (int i = 10; i < 100; i++)
			for (int j = 100; j < 1000; j++)
				if (i*j < 10000 && isPandigital(i, j, i*j))
					products.add(i*j);
				
	
		Set<Integer> productSet = new LinkedHashSet<>(products);
		int sum = 0;
		for (int num : productSet)
			sum += num;
		
		System.out.println(sum);
	}
	
	
	public static boolean isPandigital(int num1, int num2, int product){
		
		String num = num1 + "" + num2 + "" + product;
		for (int i = 1; i <= num.length(); i++)
			if (!num.contains(i + ""))
				return false;
		
		return true;
	}
}
