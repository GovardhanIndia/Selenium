package week1.coding.challenge;
import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objRef = new Scanner(System.in);
		System.out.println("Enter the String");
		String word = objRef.nextLine();
		String formatWord = word.replaceAll("\\s+", "");
		formatWord = formatWord.toUpperCase();
		validatePalindRomeByChar(formatWord, word);
		validatePalindRomeByString(formatWord);
		
	}

	 static void validatePalindRomeByString(String word) {
		// TODO Auto-generated method stub
		String newWord[] = word.split("");
		int arrSize = newWord.length;
		boolean palindRome = false;

		for(int i=0;i<arrSize;i++) {
			
			if(newWord[i].equals(newWord[(arrSize-i)-1])) {
				palindRome = true;
			}
			else {
				palindRome = false;
				break;
			}
		}
		if(palindRome == true) {
			System.out.println("The Given String is Palind Rome : "+word);
		}
		else
			System.out.println("The Given String is not a palind Rome : "+word);
	}

	static void validatePalindRomeByChar(String formatWord, String word){
		char wordToChar[] = new char[formatWord.length()];

		for(int i=0;i<formatWord.length();i++) {			
			wordToChar[i] = formatWord.charAt(i);				
			//wordToChar[i] = Character.toUpperCase(wordToChar[i]);			
		}

		int arrSize = wordToChar.length;
		boolean palindRome = false;

		for(int i = 0; i<arrSize;i++) {
			if(wordToChar[i] == wordToChar[(arrSize-i) - 1]) {
				palindRome = true;
			}
			else {
				palindRome = false;
				break;
			}
		}

		if(palindRome == true) {
			System.out.println("The Given String is Palind Rome : "+word);
		}
		else
			System.out.println("The Given String is not a palind Rome : "+word);
	}
}

