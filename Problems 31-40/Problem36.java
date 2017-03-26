//Sean Gordon, 3/25/17
//the answer is 872187
//run-time is .10 seconds

package ProjectEuler;

public class Problem36 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
	
	
	public static void run(){
		
		final int LIMIT = 1000000;
		long sum = 0;
		
		for (int i = 0; i < LIMIT; i++)
			if (isPalindrome(i + "") && isPalindrome(Integer.toBinaryString(i)))
				sum += i;
		
		System.out.println(sum);
	}
	
	
	public static boolean isPalindrome(String num){
		
		for (int i = 0; i < num.length() / 2; i++)
			if (num.charAt(i) != num.charAt(num.length()-1-i))
				return false;
		
		return true;
	}
}
