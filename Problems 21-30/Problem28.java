//Sean Gordon 3/24/17
//the answer is 669171001

package ProjectEuler;

public class Problem28 {

	public static void main(String args[]){
		
		final int SIDE_LENGTH = 1001;
		int sideLevel = 1;
		long sum = 1;
		
		for (int i = 3; i <= SIDE_LENGTH; i+=2){
			sum += 4 * (i*i) - (12 * sideLevel);
			sideLevel++;
		}
		
		System.out.println(sum);
	}
}
