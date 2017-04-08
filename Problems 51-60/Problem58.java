//Sean Gordon, 4/7/17
//the answer is 26241
//run-time is .388 seconds

package ProjectEuler;

public class Problem58 {

	public static void main(String args[]){
		
		long start = System.nanoTime();
		run();
		long end = System.nanoTime();
		System.out.println((double) (end - start) / 1000000000 + " seconds");
	}
			
	public static void run(){
		
		NumberMethods numberMethods = new NumberMethods();
		long sideLength = 1;
		long totalNums = 1;
		long numPrimes = 0;
		boolean found = false;
		
		while (!found){
			
			sideLength += 2;
			
			if (numberMethods.isPrime(sideLength*sideLength - sideLength + 1))
				numPrimes++;
			if (numberMethods.isPrime(sideLength*sideLength - 2*sideLength + 2))
				numPrimes++;
			if (numberMethods.isPrime(sideLength*sideLength - 3*sideLength + 3))
				numPrimes++;
			
			totalNums += 4;
			if (((double) numPrimes / totalNums) < .10)
				found = true;
		}
		
		System.out.println(sideLength);
	}
}
