//Sean Gordon, 3/30/17
//the answer is 5482660
//run-time is .766 seconds

package ProjectEuler;

public class Problem44 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
		
		
	public static void run(){
		
		for (int i = 1; i < 10000; i++){
			
			long pentagon_i = (i*(3*i-1))/2; 
			for(int j = i + 1; j < 10000; j++){
				
				long pentagon_j = (j*(3*j-1))/2;
				if(isPentagonNumber(pentagon_j + pentagon_i) && isPentagonNumber(pentagon_j - pentagon_i))
					System.out.println(pentagon_j - pentagon_i);
			}
		}
	}
	
	
	public static boolean isPentagonNumber(long i){
		
		double num = (1 + Math.sqrt(1 + 24*i))/6;
		if (num != 0 && (long)num == num)
			return true;
		
		return false;
	}
}
