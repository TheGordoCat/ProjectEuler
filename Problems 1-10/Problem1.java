//Sean Gordon, 2/25/17 (updated 3/27/17)
//the answer is 233168
//run-time is 1.869x10^-4 seconds

package ProjectEuler;

public class Problem1 {

	public static void main(String args[]){
		
		long start = System.nanoTime();
		run();
		long end = System.nanoTime();
		System.out.println((double) (end - start) / 1000000000 + " seconds");
	}
		
	public static void run(){
		
		final int RANGE = 1000;
		int sum = 0;
		
		for (int i = 1; i < RANGE; i++){
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		System.out.println(sum);
	}
}
