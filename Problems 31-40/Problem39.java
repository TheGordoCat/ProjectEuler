//Sean Gordon, 3/28/17
//the answer is 840
//run-time is .328 seconds

package ProjectEuler;

public class Problem39 {

	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000 + " seconds");
	}
	
	public static void run(){
		
		int[] perimeter = new int[1000];
		
		for (int i = 0; i < perimeter.length; i++)
			for (int a = 1; a < perimeter.length; a++)
				for (int b = a; b < perimeter.length; b++){
					
					int c = (i + 1) - a - b;
					if ((c > 0) && (a*a + b*b == c*c))
						perimeter[i]++;
				}
		
		int max = 0;
		int place = 0;
		for (int i = 0; i < perimeter.length; i++)
			if(perimeter[i] > max){
				max = perimeter[i];
				place = i + 1;
			}
		
		System.out.println(place);
	}
}
