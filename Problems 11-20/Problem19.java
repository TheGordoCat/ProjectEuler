//Sean Gordon, 3/22/17 (updated 4/14/17)
//the answer is 171
//run-time is .022 seconds

package ProjectEuler;
import java.util.GregorianCalendar;

public class Problem19 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
			
	public static void run(){
		
		GregorianCalendar start = new GregorianCalendar(1901, 0, 1);
		GregorianCalendar end = new GregorianCalendar(2001, 0, 1);
		
		int count = 0;
		while (start.get(GregorianCalendar.YEAR) != end.get(GregorianCalendar.YEAR)){
			
			if (start.get(GregorianCalendar.DAY_OF_WEEK) == 1)
				count++;
			start.add(GregorianCalendar.MONTH, 1);
		}
		
		System.out.println(count);
	}
}
