//Sean Gordon, 3/8/17
//the answer is 837799

package ProjectEuler;

public class Problem14 {

	public static void main(String args[]){
		
		int maxCollatz = 0;
		long number = 0;
		
		for (long i = 1; i < 1000000; i++){
			if (collatz(i) > maxCollatz){
				maxCollatz = collatz(i);
				number = i;
			}
		}
		System.out.println(number);
		
	}
	
	public static int collatz(long num){
		
		int count = 1;
		
		while (num != 1){
			if (num % 2 == 0){
				num /= 2;
				count++;
			
			}
			else{
				num = 3*num + 1;
				count++;
			}
		}
		
		return count;
	}
}
