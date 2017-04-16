//Sean Gordon 3/24/17 (updated 4/15/17)
//the answer is 4179871
//run-time is .389 seconds

package ProjectEuler;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Problem23 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
			
	public static void run(){
		
		final int MAX_NUM = 28123;
		long totalSum = 0;
		ArrayList<Integer> abundantNums = new ArrayList<Integer>();
		Set<Integer> sumsOfAbundants = new LinkedHashSet<>();
		
		for (int i = 1; i <= MAX_NUM; i++){
			totalSum += i;
			if (sumOfDivisors(i) > i)
				abundantNums.add(i);
		}
		
		for (int i = 0; i < abundantNums.size(); i++)
			for (int j = i; j < abundantNums.size(); j++)
				if (abundantNums.get(i) + abundantNums.get(j) <= MAX_NUM)
					sumsOfAbundants.add(abundantNums.get(i) + abundantNums.get(j));
				
	
		long abundantSum = 0;
		for (int num : sumsOfAbundants)
			abundantSum += num;
		
		System.out.println(totalSum - abundantSum);
	}

	
	public static int sumOfDivisors(int num){
		
		int sum = 1; //need to count one but not num
		
		for (int i = 2; i*i <= num; i++){
			if (num % i == 0)
				sum += i + num/i;
			if (i*i == num)
				sum -= i;
		}
		return sum;
	}
}
