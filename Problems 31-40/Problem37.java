//Sean Gordon, 3/26/27
//the answer is 748317
//run-time is .265 seconds

package ProjectEuler;

public class Problem37 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
	
	public static void run(){
		
		long sum = 0;
		int count = 0;
		int num = 10; //2,3,5, and 7 are not truncatable primes
		final int MAX_COUNT = 11;
		
		while(count < MAX_COUNT){
			
			if (truncatable(num)){
				count++;
				sum += num;
			}
			num++;
		}
		
		System.out.println(sum);
	}
	
	
	public static boolean truncatable(int num){
		
		NumberMethods numberMethods = new NumberMethods();
		if (!numberMethods.isPrime(num))
			return false;
		
		String leftTruncatable = num + "";
		for (int i = 1; i < leftTruncatable.length(); i++)
			if (!numberMethods.isPrime(Integer.parseInt(leftTruncatable.substring(i))))
				return false;
		
		String rightTruncatable = num + "";
		for (int i = 1; i < rightTruncatable.length(); i++)
			if (!numberMethods.isPrime(Integer.parseInt(rightTruncatable.substring(0, rightTruncatable.length()-i))))
				return false;
		
		return true;
	}
}
