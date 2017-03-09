//Sean Gordon, 3/8/17
//the answer is 76576500

package ProjectEuler;

public class Problem12 {

	public static void main(String args[]){
		
		int triangle = 0;
		int count = 1;
		boolean numFound = false;
		
		while (!numFound){
			
			triangle += count;
			if (numberOfDivisors(triangle) > 500)
				numFound = true;
			else
				count++;
		}
		
		System.out.println(triangle);
	}
	
	
	public static int numberOfDivisors(int num){
		
		int numDivisors = 1;
		for (int i = 1; i <= num/2; i++){
			if (num % i == 0)
				numDivisors++;
		}
		
		return numDivisors;
	}
}
