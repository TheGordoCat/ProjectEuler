//Sean Gordon, 3/30/17
//the answer is 134043
//run-time is .516 seconds

package ProjectEuler;

public class Problem47 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
		
		
	public static void run(){
		
		boolean found = false;
		int num = 0;
		int distinctNum = 4;
		
		for (int i = 2; !found; i++)
			for (int j = 0; j < distinctNum; j++){
				
				if (numOfDistinctPrimeFactors(i+j) != distinctNum)
					break;
				
				if (j == distinctNum-1){
					found = true;
					num = i;
				}
			}
			
		System.out.println(num);
	}
	
	//save this method
	public static int numOfDistinctPrimeFactors(long num){
		
		NumberMethods numberMethods = new NumberMethods();
		int count = 0;
		
		for (int i = 1; i*i <= num; i++){
			if (num % i == 0 && numberMethods.isPrime(i))
				count++;
			if (num % i == 0 && numberMethods.isPrime(num/i))
				count++;
		}
				
		return count;
	}	
}
