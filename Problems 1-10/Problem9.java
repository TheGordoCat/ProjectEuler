//Sean Gordon, 2/28/17 (updated 3/24/17 and 4/9/17)
//the answer is 31875000
//run-time is .002 seconds

package ProjectEuler;

public class Problem9 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
			
	public static void run(){
		
		int sum = 1000;
		
		outerloop:
		for (int a = 1; a <= sum; a++)
			for (int b = 1; b <= sum; b++){
				
				int c = sum - a - b;
				if (a*a + b*b == c*c){
					System.out.println(a*b*c);
					break outerloop;
				}
			}
		
	}
}