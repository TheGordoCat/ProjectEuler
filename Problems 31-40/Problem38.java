//Sean Gordon, 3/31/17
//the answer is 932718654
//run-time is .002 seconds

/*explanation: 
 * the number had to start with 9 because of the example given.
 * 2, 3, 5, 6, 7, 8, and digit nums would not work because they would go over the 9 digit limit or n would
 * have to equal 1, which the problem says cannot happen.
 * So the answer had to be a 4 digit number that began with the number 9. */

package ProjectEuler;

public class Problem38 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
		
		
	public static void run(){
		
		final int UPPER_LIMIT = 10000;
		final int LOWER_LIMIT = 9000;
		long maxPandigital = 0;
		
		for (int i = LOWER_LIMIT; i < UPPER_LIMIT; i++){
			long pandigitalNum = pandigitalMulitplesNum(i, i*2);
			if (pandigitalNum != 0 && pandigitalNum > maxPandigital)
				maxPandigital = pandigitalNum;
		}
		
		System.out.println(maxPandigital);
	}
	
	public static long pandigitalMulitplesNum(int num1, int num2){
		
		String num = num1 + "" + num2;
		for (int i = 1; i <= num.length(); i++)
			if (!num.contains(i + ""))
				return 0;
		
		return Long.parseLong(num);
	}
}
