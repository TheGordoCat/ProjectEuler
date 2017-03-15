//Sean Gordon, 3/15/17
//the answer is 31626

package ProjectEuler;

public class Problem21 {

	public static void main(String args[]){
		
		int amicableSum = 0;
		final int LIMIT = 10000;
		
		for (int i = 1; i < LIMIT; i++){
			int sum = sumOfDivisors(i);
			if (i == sumOfDivisors(sum) && sumOfDivisors(sum) < LIMIT && i != sum)
				amicableSum += i;
		}
	
		System.out.println(amicableSum);	
	}
	
	public static int sumOfDivisors(int num){
			
		int sum = 0;
		for (int i = 1; i <= num / 2; i++){
			if (num % i == 0)
				sum += i;
		}
		return sum;
	}
	
}

	