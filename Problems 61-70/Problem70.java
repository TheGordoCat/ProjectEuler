//Sean Gordon, 4/16/17
//the answer is 8319823
//run-time is 16.187 seconds

package ProjectEuler;

public class Problem70 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
		
	public static void run(){
		
		final int LIMIT = 10000;
		NumberMethods nu = new NumberMethods();
		double min = Double.MAX_VALUE;
		int value = 0;
		
		int[] phiOf = new int[LIMIT + 1];
		for (int i = 1; i <= LIMIT; i++)
			phiOf[i] = (int) nu.phi(i);
		
		
		for (int i = 1; i <= LIMIT; i++)
			for (int j = 1; j <= LIMIT; j++){
				
				if (nu.hcf(i, j) == 1 && i != j && i*j < 10000000){
			
					int phiOfIJ = phiOf[i] * phiOf[j];
					if(isPermutation(i*j, phiOfIJ) && (double)(i*j)/phiOfIJ < min){
						min = (double) (i*j)/phiOfIJ;
						value = i*j;
						//System.out.println((i*j) + " " + phiOfIJ);
					}
				}
			}
		
		System.out.println(value);
	}
	
	
	public static boolean isPermutation(int n1, int n2){
		
		int[] numbers = new int[10];
		
		while(n1 > 0){
			numbers[n1 % 10]++;
			n1 /= 10;
		}
		
		while(n2 > 0){
			numbers[n2 % 10]--;
			n2 /= 10;
		}
		
		for (int i = 0; i < numbers.length; i++)
			if (numbers[i] != 0)
				return false;
		
		return true;
	}
}
