//Sean Gordon, 2/27/17 (updated 4/7/17)
//the answer is 25164150
//run-time is 1.59x10^-4 seconds

package ProjectEuler;

public class Problem6 {
	
	public static void main(String args[]){
		
		long start = System.nanoTime();
		run();
		long end = System.nanoTime();
		System.out.println((double) (end - start) / 1000000000 + " seconds");
	}
		
	public static void run(){
		
		final int NUM = 100;
		int difference = squareOfSum(NUM) - sumOfSquares(NUM);
		
		System.out.println(difference);
	}
	
	
	public static int sumOfSquares(int num){
		
		int sum = 0;
		for (int i = 1; i <= num; i++)
			sum += i*i;
		
		return sum;
	}
	
	public static int squareOfSum(int num){
		
		int sum = 0;
		for (int i = 1; i <= num; i++)
			sum += i;
		
		return sum*sum;
	}
}
