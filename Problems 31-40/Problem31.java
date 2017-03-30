//Sean Gordon, 3/30/17
//the answer is 73682
//run-time is 1.873x10^-4 seconds

package ProjectEuler;

public class Problem31 {

	public static void main(String args[]){
		
		long start = System.nanoTime();
		run();
		long end = System.nanoTime();
		System.out.println((double) (end - start) / 1000000000 + " seconds");
	}
		
		
	public static void run(){
		
		int[] coins = {1, 2, 5, 10, 20, 50, 100, 200};
		final int CHANGE = 200;
		
		System.out.println(numWays(coins, CHANGE));
	}
	
	
	public static long numWays(int[] coins, int change){
		
		long[] count = new long[change + 1];
		count[0] = 1;
		
		for (int i = 0; i < coins.length; i++)
			for (int j = coins[i]; j <= change; j++)
				count[j] += count[j - coins[i]];
		
		return count[change];
	}
}
