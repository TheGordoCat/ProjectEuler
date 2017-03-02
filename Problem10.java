//Sean Gordon, 3/1/17
//the answer is 142913828922

package ProjectEuler;

public class Problem10 {

	public static void main(String args[]){
		
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
