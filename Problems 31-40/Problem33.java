//Sean Gordon, 3/31/17
//the answer is 100
//run-time is .006 seconds

package ProjectEuler;

public class Problem33 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
		
		
	public static void run(){
		
		final int UPPER_LIMIT = 100;
		final int LOWER_LIMIT = 10;
		double numProduct = 1;
		double denomProduct = 1;
		
		for (int i = LOWER_LIMIT; i < UPPER_LIMIT; i++)
			for (int j = UPPER_LIMIT-1; j > i; j--){
				
				double fraction = (double) i / j;
				if (digitCancel(i, j) == fraction){
					numProduct *= i;
					denomProduct *= j;
				}
			}
		
		System.out.println((1/(numProduct/denomProduct)));
	}
	
	public static double digitCancel(int i, int j){
		
		String numerator = i + "";
		String denominator = j + "";
		
		if (numerator.charAt(1) == denominator.charAt(0)){
			numerator = numerator.charAt(0) + "";
			denominator = denominator.charAt(1) + "";
			return Double.parseDouble(numerator) / Double.parseDouble(denominator);
		}
			
		return 0;
	}
		
}
