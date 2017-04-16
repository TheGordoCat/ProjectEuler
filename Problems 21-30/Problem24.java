//Sean Gordon, 3/15/17 (updated 4/15/17)
//the answer is 2783915460
//run-time is .001 seconds

package ProjectEuler;

import java.util.ArrayList;
public class Problem24 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
			
	public static void run(){
		
		NumberMethods numberMethods = new NumberMethods();
		int termNumber = 999999; //0-indexed term
		String num = "";
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++){
			list.add(i);
		}
		
		while(list.size() > 0){
			
			int fact = numberMethods.factorial(list.size()-1);
			int place = termNumber / fact;
			
			num += list.get(place);
			list.remove(place);
			
			if (place != 0)
				termNumber %= fact;
		}
		System.out.println(num);
	}
}
