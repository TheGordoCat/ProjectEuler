//Sean Gordon, 2/27/17
//the answer is 906609

package ProjectEuler;

public class Problem4 {

	public static void main(String args[]){
		
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
