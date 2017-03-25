//Sean Gordon, 3/25/17
//the answer is 443839

package ProjectEuler;

public class Problem30 {

	public static void main(String args[]){
		
		/*solve for n*(9^5) = 10^n to get the upper bound
		 * n < 6 so we choose 10^6 to be the limit */
		
		final int LIMIT = 1000000;
		long sum = 0;
		
		for (int i = 2; i <= LIMIT; i++){
			if(isSumOfFifthPowers(i))
				sum += i;
		}
		System.out.println(sum);
	}
	
	
	public static boolean isSumOfFifthPowers(int num){
		
		String numString = num + "";
		int sum = 0;
		
		for (int i = 0; i < numString.length(); i ++)
			sum += (int) Math.pow(Integer.parseInt(numString.charAt(i) + ""), 5);
		
		if (sum == num)
			return true;
		else
			return false;
		
	}
}
