//Sean Gordon, 3/30/17
//the answer is 510510
//run-time is 23.304 seconds

package ProjectEuler;

public class Problem69 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
		
		
	public static void run(){
		
		NumberMethods numberMethods = new NumberMethods();
		final int LIMIT = 1000;
		double maxValue = 0;
		int maxNum = 0;
			
		for (int i = 2; i <= LIMIT; i++){
				
			double value = ((double)(i) / (numberMethods.phi(i)));
			if (value > maxValue){
				maxValue = value;
				maxNum = i;
			}
		}
		
		
		for (int i = 2; i <= LIMIT; i++)
			for (int j = i; j <= LIMIT; j++){
				
				if (numberMethods.hcf(i, j) == 1){
					double value = ((double)(i*j) / (numberMethods.phi(i) * numberMethods.phi(j)));
					if (value > maxValue){
						maxValue = value;
						maxNum = i*j;
				}
			}
		}
		
		System.out.println(maxNum);
	}
}
