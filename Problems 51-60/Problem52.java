//Sean Gordon, 3/31/17
//the answer is 142857
//run-time is .01 seconds

package ProjectEuler;

public class Problem52 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
		
		
	public static void run(){
		
		boolean found = false;
		
		for (int i = 1; !found; i++)
			for (int j = 2; j <= 6; j++){
				if (!isPermutation(i, i*j))
					break;
				
				if (j == 6){
					System.out.println(i);
					found = true;
				}
			}
	
	}
	
	
	public static boolean isPermutation(int num1, int num2){
		
		int[] nums = new int[10];
		
		for (int i = num1; i > 0; i /= 10)
			nums[i%10]++;
		
		for (int i = num2; i > 0; i /= 10)
			nums[i%10]--;
		
		for (int i = 0; i < nums.length; i++)
			if (nums[i] != 0)
				return false;
		
		return true;
	}
}
