//Sean Gordon, 2/27/17
//revised on 3/1/17 and 4/7/17
//the answer is 104743
//run-time is .018 seconds

package ProjectEuler;

public class Problem7 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
		
	public static void run(){
		
		NumberMethods numberMethods = new NumberMethods();
		int count = 0;
		int num = 0;
		int nthPrime = 10001;
		
		for (num = 2; count != nthPrime; num++)
			if (numberMethods.isPrime(num))
				count++;
		
		System.out.println(num);
	}
}
