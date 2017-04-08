//Sean Gordon, 2/25/17 (updated 4/7/17)
//the answer is 4613732
//run-time is .065 seconds

package ProjectEuler;

public class Problem2 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
		
	public static void run(){
		
		int num = 3;
		int sum = 0;
		int fibNum = 0;
		final int MAX = 4000000;
		
		while (fibNum <= MAX){
			
			fibNum = Fibonacci(num);
			if (fibNum % 2 == 0)
				sum += fibNum;
			num++;
		}
		
		System.out.println(sum);
	}
	
	public static int Fibonacci(int num){
		
		if (num <= 1)
			return num;
		else 
			return Fibonacci(num - 1) + Fibonacci(num - 2);
	}
}
