//Sean Gordon, 3/25/17
//the answer is 210
//run-time is 55 seconds (hoping to fix this, not sure what the problem is)
//fixed by using StringBuilder on 3/26/17. Run-time is now .016 seconds

package ProjectEuler;

public class Problem40 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
	
	public static void run(){
		
		StringBuilder num = new StringBuilder(".");
		int count = 1;
		final int LENGTH = 1000000;
		
		while (num.length() <= LENGTH){
			num.append(count);
			count++;
		}
		
		int product = 1;
		for (int i = 1; i < num.length(); i*=10)		
			product *= Integer.parseInt(num.charAt(i) + "");
		
		System.out.println(product);
	}
}
