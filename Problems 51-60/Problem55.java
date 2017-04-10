//Sean Gordon, 4/9/17
//the answer is 249
//run-time is .078 seconds

package ProjectEuler;

import java.math.BigInteger;

public class Problem55 {

public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
			
	public static void run(){
		
		final int LIMIT = 10000;
		int count = 0;
		
		for (int i = 1; i < LIMIT; i++)
			if (isLychrelNumber(BigInteger.valueOf(i)))
				count++;
			
		System.out.println(count);
	}
	
	//Lychrel numbers do not form palindromes when the reversed nums are added
	public static boolean isLychrelNumber(BigInteger num){
		
		for (int i = 0; i < 50; i++){
			BigInteger sum = num.add(reverse(num));
			if (isPalindrome(sum))
				return false;
			else
				num = sum;
		}
		
		return true;
	}
	
	public static BigInteger reverse(BigInteger n){
		
		String num = n.toString();
		String rev = "";
		
		for (int i = num.length()-1; i >= 0; i--)
			rev += num.charAt(i);
		
		BigInteger reverse = new BigInteger(rev);
		return reverse;
	}
	
	
	public static boolean isPalindrome(BigInteger n){
		
		String num = n.toString();
		for (int i = 0; i < num.length(); i++)
			if (num.charAt(i) != num.charAt(num.length()-i-1))
				return false;
		
		return true;
		
	}
}
