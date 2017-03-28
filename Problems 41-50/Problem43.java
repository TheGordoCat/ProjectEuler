//Sean Gordon, 3/27/17
//the answer is 16695334890
//run-time is 2527.689 seconds
//go back through and use Heap's Permutation Algorithm

package ProjectEuler;

public class Problem43 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
	
	
	public static void run(){
		
		long sum = 0;
		long lowerlimit = 1023456789;
		long upperlimit = 9876543210L;
		
		for (long i = lowerlimit; i <= upperlimit; i++){
			if (isPandigital(i) && hasDivisibleSubstrings(i))
				sum += i;
		}
		
		System.out.println(sum);
	}
	
	
	public static boolean hasDivisibleSubstrings(long n){
		
		int[] primes = {2, 3, 5, 7, 11, 13, 17};
		String num = n + "";
		
		for (int i = 0; i < primes.length; i++)
			if (Integer.parseInt(num.substring(i+1, i+4)) % primes[i] != 0)
				return false;
		
		return true;
	}
	
	
	public static boolean isPandigital(long n){
		
		String num = n + "";
		for (int i = 0; i < num.length(); i++)
			if (!num.contains(i + ""))
				return false;
		
		return true;
	}
}
