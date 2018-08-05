package week5codingchallenge;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PercentageOfLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Password");
		str = obj.nextLine();
		findPercentage(str);
	}

	private static void findPercentage(String str) {
		// TODO Auto-generated method stub
		int countOfString = str.length();
		int specialChar = 0, lowerCase = 0, upperCase = 0, digit = 0;
		float totSpecialChar = 0f, totalLowerCase = 0f, totalUpperCase = 0f, totalDigits=0f;
		
		for(int i=0;i<countOfString;i++) {
			if(!(Character.isLetterOrDigit(str.charAt(i)))) {
				specialChar++;
			}
			if(Character.isLowerCase(str.charAt(i))) {
				lowerCase++;
			}
			if(Character.isUpperCase(str.charAt(i))) {
				upperCase++;
			}
			if(Character.isDigit(str.charAt(i))) {
				digit++;
			}
			 
			
		}
		totSpecialChar = ((float)specialChar*100)/countOfString;
		totalLowerCase = ((float)lowerCase*100)/countOfString;
		totalUpperCase = ((float)upperCase*100)/countOfString;
		totalDigits = ((float)digit*100)/countOfString;
		DecimalFormat df = new DecimalFormat("0.##");
		df.setMinimumFractionDigits(2);
		System.out.println("Total Special Characters in the Given String - "+specialChar+" The Percentage - " +df.format(totSpecialChar));
		System.out.println("Total Lower Case in the Given String - " +lowerCase+" The Percentage - " +df.format(totalLowerCase));
		System.out.println("Total Upper Characters in the Given String - " +upperCase+" The Percentage - "+df.format(totalUpperCase));
		System.out.println("Total Digits in the Given String - " +digit+" The Percentage - "+df.format(totalDigits));
	}

}