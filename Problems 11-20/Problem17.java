//Sean Gordon, 3/9/17 (updated 4/15/17)
//the answer is 21124
//run-time is 4.96x10^-4 seconds

package ProjectEuler;

public class Problem17 {

	public static void main(String args[]){
		
		long start = System.nanoTime();
		run();
		long end = System.nanoTime();
		System.out.println((double) (end - start) / 1000000000 + " seconds");
	}
			
	public static void run(){	
	
		int letterSum = 0;
		
		for (int i = 1; i <= 1000; i++)
			letterSum += numLetters(i);
		
		System.out.println(letterSum);
	}
	
	
	public static int numLetters(int num){
		
		int letters = 0;
		
		//single digit numbers
		if (num < 20)
			letters = lessThanTwenty[num].length();
		
		//double digit numbers
		if (num < 100 && num >= 20){
			letters += multipleOfTens[num/10].length();
			letters += numLetters(num % 10);
		}
		
		//triple digit numbers
		if (num < 1000 && num >= 100){
			letters += numLetters(num / 100) + "hundred".length();
			if (num % 100 != 0)
				letters += "and".length() + numLetters(num % 100);
		}
		
		if (num == 1000)
			letters = "one thousand".length() - 1;
		
		return letters;
	}
	
	
	static String[] lessThanTwenty = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", 
		"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	static String[] multipleOfTens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
}
