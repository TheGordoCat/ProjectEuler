//Sean Gordon, 3/1/17 
//revised on 3/1/17 and 4/12/17
//the answer is 142913828922
//run-time is .021 seconds

package ProjectEuler;

import java.util.Arrays;

public class Problem10 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
			
	public static void run(){
		
		final int LIMIT = 2000000;
		long sum = 0;
		boolean[] nums = new boolean[LIMIT + 1];
		Arrays.fill(nums, true);
		
		for (int i = 2; i < nums.length; i++)
			if (nums[i]){
				sum += i;
				for (int j = 2*i; j < nums.length; j += i)
					nums[j] = false;
			}
		
		System.out.println(sum);
	}
}
