//Sean Gordon, 3/30/17
//the answer is -59231
//run-time is .079 seconds

package ProjectEuler;

public class Problem27 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
		
		
	public static void run(){
		
		NumberMethods numberMethods = new NumberMethods();
		int maxA = 0; 
		int maxB = 0;
		int maxCount = 0;
		
		for (int a = -999; a < 1000; a++)
			for (int b = 1; b < 1000; b++){ //b must be prime since if i = 0 then i*i + a*i + b = prime
				
				boolean terminates = false;
				int count = 0;
				for (int i = 0; !terminates; i++){
					
					int function = i*i + a*i + b;
					if (numberMethods.isPrime(function))
						count++;
					else
						terminates = true;
				}
				
				if (count > maxCount){
					maxCount = count;
					maxA = a;
					maxB = b;
				}
			}
		
		System.out.println((maxA * maxB));
	}
}
