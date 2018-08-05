package week5codingchallenge;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password;
		boolean isValid;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Password");
		password = obj.nextLine();
		isValid = verifyThePassword(password);
		/*Pattern p = Pattern.compile("[^A-Za-z0-9]");
	    Matcher m = p.matcher(password);
	    // boolean b = m.matches();
	    boolean b = m.find();*/
	     
		if(isValid==true) {
			System.out.println("Entered is a valid Password");		
		}
	}
	
	    /*for(int i=0;i<password.length();i++) {
	    	if(Character.isDigit(password.charAt(i))) {
	    		 numCount++;
	    	}
	    	if(Character.isAlphabetic(password.charAt(i))) {
	    		 alphaCount++;
	    	}
	    	if(Character.isUpperCase(password.charAt(i))) {
	    		capitalCase++;
	    	}    	
	     }
	     System.out.println(capitalCase);
	     System.out.println(numCount);
	     System.out.println(alphaCount);
	     
	     if((password.length()>=10) && (b==false) && (numCount>=2) && (alphaCount>=2) && (capitalCase>=1))
	    	 System.out.println("Given is a valid Password");
	     else
	    	 System.out.println("Given is Not a valid Password");
	     
*/	

	private static boolean verifyThePassword(String password) {
		// TODO Auto-generated method stub
		int numCount = 0, alphaCount = 0, capitalCase = 0;
		if(password.length()<=10) {
			System.out.println("The Password length should be minimum 10 characters");
			return false;
		}
		else {
			for(int i=0;i<password.length();i++) {
				char passChar = password.charAt(i);
				
				if(!(Character.isLetterOrDigit(passChar))) {
					System.out.println("Password should not have special characters");
					return false;
				}
				if(Character.isDigit(passChar)) {
					numCount++;
				}
				if(Character.isUpperCase(passChar)) {
					capitalCase++;
					alphaCount++;			
				}
				if(Character.isAlphabetic(passChar)) {
					alphaCount++;
				}
			}
			if(numCount<2) {
            	System.out.println("Password must contain atleast 2 digits");
            	return false;
            }else if(alphaCount<2) {
            	System.out.println("Password must contain atleast 2 letters");
            	return false;
            }else if(capitalCase<1) {
            	System.out.println("Password must contain atleast 1 captial letter");
            	return false;
            }
			return true;
			
		}
		
	}
}