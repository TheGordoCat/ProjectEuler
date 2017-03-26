//Sean Gordon, 3/25/17
//the answer is 55

package ProjectEuler;

public class Problem35 {

	public static void main(String args[]){
		
		NumberMethods numberMethods = new NumberMethods();
		final int LIMIT = 1000000;
		int count = 0;
		
		for (int i = 2; i < LIMIT; i++){
			if (numberMethods.isPrime(i) && isCircularPrime(i))
					count++;
		}
		
		System.out.println(count);
	}
	
	public static boolean isCircularPrime(int prime){
		
		String num = prime + "";
		NumberMethods numberMethods = new NumberMethods();
		
		for (int i = 0; i < num.length() - 1; i++){
			char firstNum = num.charAt(0);
			num = num.substring(1) + firstNum;
			if (!numberMethods.isPrime(Integer.parseInt(num)))
				return false;
		}
		
		return true;
	}
}
