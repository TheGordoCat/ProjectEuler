//Sean Gordon, 3/24/17 (updated 4/7/17)
//the answer is 669171001
//run-time is 1.66x10^-4 seconds

package ProjectEuler;

public class Problem28 {

	public static void main(String args[]){
		
		long start = System.nanoTime();
		run();
		long end = System.nanoTime();
		System.out.println((double) (end - start) / 1000000000 + " seconds");
	}
			
	public static void run(){
		
		final int SIDE_LENGTH = 1001;
		int sideLevel = 1;
		long sum = 1;
		
		for (int i = 3; i <= SIDE_LENGTH; i+=2){
			sum += 4 * (i*i) - (12 * sideLevel);
			sideLevel++;
		}
		
		System.out.println(sum);
	}
}
