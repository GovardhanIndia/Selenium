package week7day1;

import org.apache.poi.util.SystemOutLogger;

public class RegularExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub = 
		String text = "TCS(65789)_has number of 3567897 Employess";
		
		String onlyCharacters = text.replaceAll("[\\d\\W&&\\S]", "");
		System.out.println(onlyCharacters);
		
		String onlyNumbers = text.replaceAll("[^0-9]", "");
		System.out.println(onlyNumbers);
		
		System.out.println("Comapny id = "+onlyNumbers.substring(0, 5));
		
		System.out.println("Special Character in the String is "+text.replaceAll("\\w", ""));
		
		String newText = "What was your favorite childhood hiding place?";
		
		String allnewText = newText.replaceAll("[\\s]", ":");
		//System.out.println(allnewText);
		
		String[] split = newText.split("favorite");
		System.out.println(split[1]);
		String[] split2 = split[1].split("[\\s]");
		split2[1] = split2[1].replaceAll("[\\W]", "");
		
		System.out.print(split2[1]);
	}

}
