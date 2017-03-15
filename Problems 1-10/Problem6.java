//Sean Gordon, 2/27/17
//the answer is 25164150

package ProjectEuler;

public class Problem6 {

	public static void main(String args[]){
		
		final int NUM = 100;
		int difference = squareOfSum(NUM) - sumOfSquares(NUM);
		
		System.out.println(difference);
	}
	
	
	public static int sumOfSquares(int num){
		
		int sum = 0;
		for (int i = 1; i <= num; i++)
			sum += i*i;
		
		return sum;
	}
	
	public static int squareOfSum(int num){
		
		int sum = 0;
		for (int i = 1; i <= num; i++)
			sum += i;
		
		return sum*sum;
	}
}
