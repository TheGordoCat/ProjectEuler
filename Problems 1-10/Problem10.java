//Sean Gordon, 3/1/17
//revised on 3/1/17 and 4/9/17
//the answer is 142913828922
//run-time is .895 seconds

package ProjectEuler;

public class Problem10 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
			
	public static void run(){
		
		NumberMethods numberMethods = new NumberMethods();
		final int MAX_VALUE = 2000000;
		long sum = 0;
		
		for (int i = 1; i < MAX_VALUE; i++){
			if (numberMethods.isPrime(i))
				sum += i;
		}
		System.out.println(sum);
	}
}
