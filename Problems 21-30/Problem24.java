//Sean Gordon, 3/15/17
//the answer is 2783915460

package ProjectEuler;

import java.util.ArrayList;
public class Problem24 {

	public static void main(String args[]){
		
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
