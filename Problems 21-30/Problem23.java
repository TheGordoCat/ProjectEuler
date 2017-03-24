//Sean Gordon 3/24/17
//the answer is 4179871

package ProjectEuler;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Problem23 {

	public static void main(String args[]){
		
		final int MAX_NUM = 28123;
		long totalSum = 0;
		ArrayList<Integer> abundantNums = new ArrayList<Integer>();
		ArrayList<Integer> abundantSums = new ArrayList<Integer>();
		
		for (int i = 1; i <= MAX_NUM; i++){
			totalSum += i;
			if (numType(i) == 1){
				abundantNums.add(i);
			}
		}
		
		for (int i = 0; i < abundantNums.size(); i++)
			for (int j = i; j < abundantNums.size() - i; j++)
				if (abundantNums.get(i) + abundantNums.get(j) <= MAX_NUM)
					abundantSums.add(abundantNums.get(i) + abundantNums.get(j));
				
	
		Set<Integer> s = new LinkedHashSet<>(abundantSums);
		long abundantSum = 0;
		for (int num : s)
			abundantSum += num;
		
		System.out.println(totalSum - abundantSum);
	}
	
	//1 if an abundant number, 0 if perfect, -1 if deficient
	public static int numType(int num){
			
		int sum = sumOfDivisors(num);
			
		if (sum > num)
			return 1;
		else if (sum == num)
			return 0;
		else
			return -1;
	}
		
	
	public static int sumOfDivisors(int num){
		
		int sum = 0;
		for (int i = 1; i <= num / 2; i++){
			if (num % i == 0)
				sum += i;
		}
		return sum;
	}
}
