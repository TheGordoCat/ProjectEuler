//Sean Gordon, 2/28/17
//the answer is 31875000

package ProjectEuler;

public class Problem9 {

	public static void main(String args[]){
		
		int a = 0;
		int b = 0; 
		int c = 0;
		
		for (int i = 1; i <= 1000; i++){
			for (int j = 1; j <= 1000; j++){
				if (findC(i, j) != 0){
					if ((i + j + findC(i, j)) == 1000){
						a = i;
						b = j;
						c = findC(a, b);
					}
				}
			}
		}
		System.out.println(a*b*c);
	}
	
	
	//find c using Math.pow
	public static int findC(int a, int b){
		
		int c = (int) Math.sqrt(a*a + b*b);
		double cDouble = Math.sqrt(a*a + b*b);
		
		if (!isError(c, cDouble))
			return c;
		else 
			return 0;
	}
	
	//since I was getting random numbers, I used an arbitrary cutoff to see if c was truly an int
	public static boolean isError(int c, double cDouble){
		
		if (cDouble - c > .00005)
			return true;
		return false;
	}
}
