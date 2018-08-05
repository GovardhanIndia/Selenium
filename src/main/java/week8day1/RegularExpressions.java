package week8day1;

public class RegularExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub = 
		String text = "TCS(65789) has number of 3567897 Employess";
		
		String onlyCharacters = text.replaceAll("[\\d\\W&&\\S]", "");
		System.out.println(onlyCharacters);
		
		String onlyNumbers = text.replaceAll("[^0-9]", "");
		System.out.println(onlyNumbers);
		
		System.out.println("Comapny id = "+onlyNumbers.substring(0, 5));
		
		

	}

}
