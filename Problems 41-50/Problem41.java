//Sean Gordon, 3/27/17
//the answer is 7652413
//run-time is .016 seconds

package ProjectEuler;

public class Problem41 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
	
	public static void run(){
		
		NumberMethods numberMethods = new NumberMethods();
		int limit = 7654321; //8 and 9 digits don't work because they're divisible by 3
		
		for (int i = limit; i >= 0; i-=2)
			if (numberMethods.isPrime(i) && isPandigital(i)){
				System.out.println(i);
				break;
			}
	}
	
	
	public static boolean isPandigital(int n){
		
		String num = n + "";
		for (int i = 1; i <= num.length(); i++)
			if (!num.contains(i + ""))
				return false;
		
		return true;
		
	}
}
