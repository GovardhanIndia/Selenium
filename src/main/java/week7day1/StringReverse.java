package week7day1;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String : ");
		Scanner scan = new Scanner(System.in);
		String companyName = scan.nextLine();
		
		char[] charArray = companyName.toCharArray();
		int lenght = charArray.length-1;
		
		
		for(int i=lenght;i>=0;i--) {
			System.out.print(charArray[i]);
		}
		
		System.out.println();
		
		for(int i=(companyName.length())-1;i>=0;i--) {
			System.out.print(companyName.charAt(i));
		}
		System.out.println();
		
		StringBuilder build = new StringBuilder(companyName);
		StringBuilder reverse = build.reverse();
		System.out.print("The Reversed String  = " +reverse);
	 
	}

}
