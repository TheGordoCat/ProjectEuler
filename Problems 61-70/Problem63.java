//Sean Gordon, 4/11/17
//the answer is 49
//run-time is .002 seconds

package ProjectEuler;

import java.math.BigInteger;

public class Problem63 {

public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
			
	public static void run(){
		
		int count = 0; 
		
		for (int i = 1; i < 10; i++){
			
			boolean terminates = false; //what power does the argument terminate for?
			for (int j = 1; !terminates; j++)
				if (BigInteger.valueOf(i).pow(j).toString().length() != j)
					terminates = true;
				else
					count++;
		}
		
		System.out.println(count);
	}
}
