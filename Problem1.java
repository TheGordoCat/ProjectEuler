//Sean Gordon, 2/25/17
//the answer is 233168

package ProjectEuler;

public class Problem1 {

	public static void main(String args[]){
		
		final int RANGE = 1000;
		int sum = 0;
		
		for (int i = 1; i < RANGE; i++){
			if (isDivisibleByThree(i))
				sum += i;
			else if (isDivisibleByFive(i))
				sum += i;
			else{}
		}
		
		System.out.println(sum);
		
	}
	
	
	
	public static boolean isDivisibleByThree(int num){
		
		if (num % 3 == 0)
			return true;
		
		return false;
	}
	
	public static boolean isDivisibleByFive(int num){
		
		if (num % 5 == 0)
			return true;
		
		return false;
	}
	
	
}
