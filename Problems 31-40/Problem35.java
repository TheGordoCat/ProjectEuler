//Sean Gordon, 3/25/17
//the answer is 55
//run-time is .44 seconds

package ProjectEuler;

public class Problem35 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
	
	
	public static void run(){
		
		final int LIMIT = 1000000;
		int count = 0;
		
		for (int i = 2; i < LIMIT; i++){
			if (isCircularPrime(i))
					count++;
		}
		System.out.println(count);
	}
	
	public static boolean isCircularPrime(int prime){
		
		NumberMethods numberMethods = new NumberMethods();
		if (!numberMethods.isPrime(prime))
			return false;
		
		String num = prime + "";
		for (int i = 0; i < num.length() - 1; i++){
			char firstNum = num.charAt(0);
			num = num.substring(1) + firstNum;
			if (!numberMethods.isPrime(Integer.parseInt(num)))
				return false;
		}
		
		return true;
	}
}
