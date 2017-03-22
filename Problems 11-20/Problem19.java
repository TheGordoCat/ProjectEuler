//Sean Gordon, 3/22/17
//the answer is 171

package ProjectEuler;
import java.util.GregorianCalendar;

public class Problem19 {

	public static void main(String args[]){
		
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
