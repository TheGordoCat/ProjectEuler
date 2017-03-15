//Sean Gordon, 3/9/17
//the answer is 21124

package ProjectEuler;

public class Problem17 {

	public static void main(String args[]){
		
		int letterSum = 0;
		
		for (int i = 1; i <= 1000; i++){
			letterSum += numLetters(i);
		}

		System.out.println(letterSum);
	}
	
	
	public static int numLetters(int num){
		
		int letters = 0;
		
		//single digit numbers
		if (num < 20){
			switch (num){
			case 1: letters = 3; break;
			case 2: letters = 3; break;
			case 3: letters = 5; break;
			case 4: letters = 4; break;
			case 5: letters = 4; break;
			case 6: letters = 3; break;
			case 7: letters = 5; break;
			case 8: letters = 5; break;
			case 9: letters = 4; break;
			case 10: letters = 3; break;
			case 11: letters = 6; break;
			case 12: letters = 6; break;
			case 13: letters = 8; break;
			case 14: letters = 8; break;
			case 15: letters = 7; break;
			case 16: letters = 7; break;
			case 17: letters = 9; break;
			case 18: letters = 8; break;
			case 19: letters = 8; break;
			default: break;
			}
		}
		
		//double digit numbers
		if (num < 100 && num >= 20){
			
			switch (num / 10){
			case 2: letters = 6; break;
			case 3: letters = 6; break;
			case 4: letters = 5; break;
			case 5: letters = 5; break;
			case 6: letters = 5; break;
			case 7: letters = 7; break;
			case 8: letters = 6; break;
			case 9: letters = 6; break;
			default: break;
			}
			letters += numLetters(num % 10);
		}
		
		//triple digit numbers
		if (num < 1000 && num >= 100){
			
			letters += numLetters(num / 100) + 7;
			if (num % 100 != 0)
				letters += 3 + numLetters(num % 100);
		}
		
		if (num == 1000)
			letters = 11;
		
		return letters;
	}
}
