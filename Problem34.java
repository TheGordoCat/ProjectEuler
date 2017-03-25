//Sean Gordon, 3/25/17
//the answer is 40730

package ProjectEuler;

public class Problem34 {

	public static void main(String args[]){
		
		/*We check for the upper bound with 7 * (9!) which would be for 9999999
		 * 8 * (9!) is a 7 digit number, so anything higher is pointless to check
		 */
		final int UPPER_LIMIT = 10000000;
		final int LOWER_LIMIT = 3;
		long sum = 0;
		
		for (int i = LOWER_LIMIT; i < UPPER_LIMIT; i++){
			if (isSumOfFactorials(i))
				sum += i;
		}
		System.out.println(sum);
	}
	
	
	public static boolean isSumOfFactorials(long num){
		
		NumberMethods numberMethods = new NumberMethods();
		String numString = num + "";
		long sum = 0;
		
		for (int i = 0; i < numString.length(); i++)
			sum += numberMethods.factorial(Integer.parseInt(numString.charAt(i) + ""));
		
		if (sum == num)
			return true;
		else
			return false;
	}
}
