//Sean Gordon, 3/15/17 (updated 4/15/17)
//the answer is 31626
//run-time is .011 seconds

package ProjectEuler;

public class Problem21 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
			
	public static void run(){
		
		int amicableSum = 0;
		final int LIMIT = 10000;
		
		for (int i = 1; i < LIMIT; i++){
			int sum = sumOfDivisors(i);
			int sumOfTheSum = sumOfDivisors(sum);
			
			if (i == sumOfTheSum && sumOfTheSum < LIMIT && i != sum)
				amicableSum += i;
		}
		System.out.println(amicableSum);	
	}
	
	public static int sumOfDivisors(int num){
			
		int sum = 1; //need to count one but not num
		
		for (int i = 2; i*i <= num; i++){
			if (num % i == 0)
				sum += i + num/i;
			if (i*i == num)
				sum -= i;
		}
		return sum;
	}
	
}

	