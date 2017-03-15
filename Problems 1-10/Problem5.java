//Sean Gordon, 2/27/19
//the answer is 232792560

package ProjectEuler;

public class Problem5 {

	public static void main(String args[]){
		
		final int DIVISOR = 20;
		int num = 1;
		
		while (!isDivisible(num, DIVISOR)){
			num++;
		}
		
		System.out.println(num);
	}
	
	//number divisible by all numbers up to a divisor
	public static boolean isDivisible(int num, int divisor){
		
		for (int i = 1; i <= divisor; i++){
			if (num % i != 0)
				return false;
		}
		return true;
		
	}
}
