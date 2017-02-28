//Sean Gordon, 2/25/17
//the answer is 4613732

package ProjectEuler;

public class Problem2 {

	public static void main(String args[]){
		
		int num = 3;
		int sum = 0;
		int fibNum = 0;
		final int max = 4000000;
		
		do{
			fibNum = Fibonacci(num);
			if (fibNum % 2 == 0)
				sum += fibNum;
			
			num++;
			
		}while(fibNum <= max);
		
		System.out.println(sum);
	}
	
	public static int Fibonacci(int num){
		
		if (num <= 1)
			return num;
		else 
			return Fibonacci(num - 1) + Fibonacci(num - 2);
	}
}
