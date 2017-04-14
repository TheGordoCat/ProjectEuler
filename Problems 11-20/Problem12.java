//Sean Gordon, 3/8/17 (updated 4/13/17)
//the answer is 76576500
//run-time is .226 seconds

package ProjectEuler;

public class Problem12 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
			
	public static void run(){
		int triangle = 0;
		boolean found = false;
		
		for (int i = 1; !found; i++){
			triangle += i;
			if (numberOfDivisors(triangle) > 500)
				found = true;
		}
		
		System.out.println(triangle);
	}
	
	
	public static int numberOfDivisors(int num){
		
		int numDivisors = 0;
		for (int i = 1; i*i <= num; i++){
			if (num % i == 0)
				numDivisors+=2;
			if (i*i == num)		//if num is a perfect square
				numDivisors--;
		}
		
		
		return numDivisors;
	}
}
