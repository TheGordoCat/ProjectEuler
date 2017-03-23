//Sean Gordon, 2/28/17
//the answer is 23514624000

package ProjectEuler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Problem8 {
	
	public static void main(String args[]) throws IOException{
		
		String numString = readFileAsString("problem8.txt");
		final int SUBSTRING_LENGTH = 13;
		long multiple = 0;
		long maxValue = 0;
		int begin = 0;
		
		while ((begin + SUBSTRING_LENGTH) < numString.length()){
			multiple = multipleOfNums(numString.substring(begin, begin + SUBSTRING_LENGTH));
			if (multiple > maxValue)
				maxValue = multiple;
			begin++;
		}
		System.out.println(maxValue);
	}
	
	
	
	public static String readFileAsString(String filePath) throws IOException {
        	StringBuffer fileData = new StringBuffer();
        	BufferedReader reader = new BufferedReader(new FileReader(filePath));
        	char[] buf = new char[1024];
        	int numRead=0;
		
       		while((numRead=reader.read(buf)) != -1){
            		String readData = String.valueOf(buf, 0, numRead);
            		fileData.append(readData);
        	}
        	reader.close();
        	return fileData.toString();
    	}
	
	
	public static long multipleOfNums(String num){
		
		long multiple = 1;
		for (int i = 0; i < num.length(); i++){
			multiple *= getNum(num.charAt(i));
		}
		
		return multiple;
	}
	
	public static int getNum(char numChar){
		
		switch(numChar){
			case '0': return 0;
			case '1': return 1;
			case '2': return 2;
			case '3': return 3;
			case '4': return 4;
			case '5': return 5;
			case '6': return 6;
			case '7': return 7;
			case '8': return 8;
			case '9': return 9;
			default: break;
		}
		return 0;
	}
}
