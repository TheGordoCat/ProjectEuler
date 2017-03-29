//Sean Gordon, 3/28/17
//the answer is 1533776805
//run-time is .016 seconds

package ProjectEuler;

public class Problem45 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
	
	public static void run(){
		
		double i = 286;
		boolean found = false;
		
		while(!found){
			double j = ((double) 1/6) * (Math.sqrt(12*i*i + 12*i + 1) + 1);
			double k = (double) (i + 1) / 2;
		
			if (j % 1 == 0 && k % 1 == 0)
				if(triangleNum(i) == pentagonalNum(j) && triangleNum(i) == hexagonalNum(k)){
					System.out.println(triangleNum(i));
					found = true;
				}
			i++;
		}
		
	}
	
	public static double triangleNum(double num){
		return (num * (num + 1)) / 2;
	}
	
	public static double pentagonalNum(double num){
		return (num * (3*num - 1)) / 2;
	}
	
	public static double hexagonalNum(double num){
		return num * (2*num - 1);
	}
}
