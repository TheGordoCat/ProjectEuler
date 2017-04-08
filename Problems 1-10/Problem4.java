//Sean Gordon, 2/27/17 (updated 4/7/17)
//the answer is 906609
//run-time is .076 seconds

package ProjectEuler;

public class Problem4 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
		
	
	public static void run(){
		
		int maxPalindrome = 0;
		for(int i = 100; i < 1000; i++){
			for (int j = 100; j < 1000; j++){
				if (isPalindrome(i*j) && i*j > maxPalindrome)
					maxPalindrome = i*j;
			}
		}
		
		System.out.println(maxPalindrome);
	}
	
	
	public static boolean isPalindrome(int num){
		
		String numString = num + "";
		for (int i = 0; i < numString.length(); i++){
			if (numString.charAt(i) != numString.charAt(numString.length() - i - 1))
				return false;
		}
		
		return true;
	}
}
