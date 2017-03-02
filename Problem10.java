//Sean Gordon, 3/1/17
//the answer is 142913828922

package ProjectEuler;

public class Problem10 {

	public static void main(String args[]){
		
		long sum = 0;
		for (int i = 1; i < 2000000; i++){
			if (isPrime(i))
				sum += i;
		}
		System.out.println(sum);
	}
	
	//found a new way to find primes since the old way took way too long.
	//I used to find the hcf and determine if phi(i) = i - 1
	public static boolean isPrime(int num){
		
		if (num <= 1)
			return false;
		if (num == 2)
			return true;
		if (num % 2 == 0)
			return false;
		
		for (int i = 3; i * i <= num; i += 2)
			if (num % i == 0)
				return false;
		
		return true;
	}
}
